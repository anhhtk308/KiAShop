/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "SearchLiveControl", urlPatterns = {"/search"})
public class SearchLiveControl extends HttpServlet {

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
        //search tieng viet
        request.setCharacterEncoding("UTF-8");
        String txtSearch = request.getParameter("txt");

        DAO dao = new DAO();
        List<Product> list = dao.searchByName(txtSearch);

        PrintWriter out = response.getWriter();
        for (Product o : list) {
            out.println("<div class=\"col-12 col-sm-6 col-md-12 col-xl-6\">\n"
                    + "                            <div class=\"single-product-wrapper\">\n"
                    + "                                <!-- Product Image -->\n"
                    + "                                <div class=\"product-img\">\n"
                    + "                                    <img src=\""+ o.getImage()+"\" alt=\"\">\n"
                    + "                                    <!-- Hover Thumb -->\n"
                    + "                                    <!--<img class=\"hover-img\" src=\"img/product-img/product5.jpg\" alt=\"\">-->\n"
                    + "                                </div>\n"
                    + "\n"
                    + "                                <!-- Product Description -->\n"
                    + "                                <div class=\"product-description d-flex align-items-center justify-content-between\">\n"
                    + "                                    <!-- Product Meta Data -->\n"
                    + "                                    <div class=\"product-meta-data\">\n"
                    + "                                        <div class=\"line\"></div>\n"
                    + "                                        <p class=\"product-price\">$"+ o.getPrice() +"</p>\n"
                    + "                                        <a href=\"productDetail?productID="+ o.getId() +"\">\n"
                    + "                                            <h6>"+ o.getName() +"</h6>\n"
                    + "                                        </a>\n"
                    + "                                    </div>\n"
                    + "                                    <!-- Ratings & Cart -->\n"
                    + "                                    <div class=\"ratings-cart text-right\">\n"
                    + "                                        <div class=\"ratings\">\n"
                    + "                                            <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n"
                    + "                                            <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n"
                    + "                                            <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n"
                    + "                                            <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n"
                    + "                                            <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n"
                    + "                                        </div>\n"
                    + "                                        <div class=\"cart\">\n"
                    + "                                            <a href=\"Cart.jsp\" data-toggle=\"tooltip\" data-placement=\"left\" title=\"Add to Cart\"><img src=\"img/core-img/cart.png\" alt=\"\"></a>\n"
                    + "                                            <a href=\"Shop.jsp\" style='font-size:16px;' title=\"Add to favourite\">&#129505;</a>\n"
                    + "                                        </div>\n"
                    + "                                    </div>\n"
                    + "                                </div>\n"
                    + "                            </div>\n"
                    + "                        </div>");
        }
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
