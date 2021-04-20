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
import java.util.ArrayList;
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
@WebServlet(name = "MyOrder", urlPatterns = {"/order"})
public class MyOrder extends HttpServlet {

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

        //load tất cả san pham ma mk da order len
        Cookie arr[] = request.getCookies();
        List<Product> list = new ArrayList<>();
        for (Cookie o : arr) {
            if (o.getName().equals("id")) {
                String ids = o.getValue();//,6,6,100 1 chuỗi id
                String arrID[] = ids.split(",");
                for (String i : arrID) {
                    DAO dao = new DAO();
                    if (dao.getProductbyID(i) != null) {
                        list.add(dao.getProductbyID(i));
                    }
                }
                break;
            }
        }
        HttpSession session = request.getSession();
        List<Cart> listCart = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            listCart.add(new Cart(list.get(i).getId(), list.get(i).getName(), list.get(i).getImage(), 1, list.get(i).getPrice(), 0));
        }
        //xử lí list san pham
        for (int i = 0; i < listCart.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < listCart.size(); j++) {
                if (listCart.get(i).getId() == listCart.get(j).getId()) {
                    count++;
                    listCart.remove(j);
                    j--;
                    listCart.get(i).setAmount(count);
                }
            }
        }

        for (int i = 0; i < listCart.size(); i++) {
            listCart.get(i).setTotalPrice(listCart.get(i).getPrice() * listCart.get(i).getAmount());
        }

        session.setAttribute("productInCart", listCart);
        double total = totalPrice(listCart);
        session.setAttribute("total", total);
        session.setAttribute("numberItemInCart", listCart.size());

        

        request.getRequestDispatcher("Cart.jsp").forward(request, response);
        //ket thuc vong lap thì mk được 1 mảng bao gồm tất cả san phẩm đã order

    }

    public double totalPrice(List<Cart> list) {
        double total = 0;
        for (Cart cart : list) {
            total += cart.getTotalPrice();
        }
        return total;
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
