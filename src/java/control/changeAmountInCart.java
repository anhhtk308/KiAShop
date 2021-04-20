/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Cart;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
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
@WebServlet(name = "changeAmountInCart", urlPatterns = {"/changeAmount"})
public class changeAmountInCart extends HttpServlet {

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
        
        Cookie arr[] = request.getCookies();
        String txt = "";
        if (arr != null) {
            for (Cookie o : arr) {
                if (o.getName().equals("id")) {
                    o.setMaxAge(0);//xoa cookie cu di
                    response.addCookie(o);//xoa cookie cu o trinh duyet cua minh
                }
            }
        }
        
        HttpSession session = request.getSession();
        String id = request.getParameter("id");
        String index = request.getParameter("index");
        List<Cart> listCart = (List<Cart>) session.getAttribute("productInCart");
        DAO dao = new DAO();
        Product p = dao.getProductByID(id);
        int amount = getAllAmount(listCart, Integer.parseInt(id));
        Cart c = getCartByID(listCart, Integer.parseInt(id));
        if (index.equals("0")) {
            if (c.getAmount() > 1) {
                c.setAmount(c.getAmount() - 1);
                c.setTotalPrice(c.getTotalPrice() - c.getPrice());
                
            }
        } else {
            if (amount < p.getAmount()) {
                c.setAmount(c.getAmount() + 1);
                c.setTotalPrice(c.getTotalPrice() + c.getPrice());
            }
        }
        double total = totalPrice(listCart);
        session.setAttribute("productInCart", listCart);
        session.setAttribute("total", total);
        
        for (int i = 0; i < listCart.size(); i++) {
            for (int j = 0; j < listCart.get(i).getAmount(); j++) {
                txt += "," + listCart.get(i).getId();
            }
            
        }
        
        
        //b2: luu id len tren cookie
        //luu id len cart tren cookie
        Cookie co = new Cookie("id", txt);
        co.setMaxAge(60*60);
        //luu cookie o tren browser cococ,chrome,ie
        response.addCookie(co);
        
        request.getRequestDispatcher("Cart.jsp").forward(request, response);
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

    public double totalPrice(List<Cart> list) {
        double total = 0;
        for (Cart cart : list) {
            total += cart.getTotalPrice();
        }
        return total;
    }
    public Cart getCartByID(List<Cart> list, int id) {
        for (Cart cart : list) {
            if (cart.getId() == id) {
                return cart;
            }
        }
        return null;
    }

    public int getAllAmount(List<Cart> list, int id) {
        int amount = 0;
        for (Cart cart : list) {
            if (cart.getId() == id) {
                amount += cart.getAmount();
            }
        }
        return amount;
    }
}
