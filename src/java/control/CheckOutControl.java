/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Account;
import entity.Cart;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "CheckOutControl", urlPatterns = {"/CheckOut"})
public class CheckOutControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        DAO dao = new DAO();
        HttpSession session = request.getSession();
        List<Cart> listCart = (List<Cart>) session.getAttribute("productInCart");
        Account a = (Account) session.getAttribute("acc");
        // get Information from form
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");

        double totalPrice = (double) session.getAttribute("total");
        if (totalPrice == 0.0) {
            response.sendRedirect("ShopControl");
            return;
        }
        // get Date have
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date dateInsert = java.sql.Date.valueOf(dateFormat.format(date));

        dao.insertOrder(dateInsert + "", a.getId(), address, phone, firstname +" "+ lastname, totalPrice);

        int orderID = dao.getOrderID();

        for (Cart cart : listCart) {
            Product p = dao.getProductByID(cart.getId() + "");
            dao.insertOrderDetails(orderID, p.getId(), p.getPrice(), cart.getAmount());
        }

        // update order information about total amount and total price
        for (Cart cart : listCart) {
            Product p = dao.getProductByID(cart.getId() + "");
            int reduceAmount = p.getAmount() - cart.getAmount();
            dao.updateAmounProduct(reduceAmount, p.getId());
        }

        //xoa cookies
        Cookie cookies[] = request.getCookies();
        for (Cookie o : cookies) {
            if (o.getName().equals("id")) {
                o.setMaxAge(0);
                response.addCookie(o);
            }
        }
        
        request.getRequestDispatcher("ShopControl").forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
