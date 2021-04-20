/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "CartControl", urlPatterns = {"/cart"})
public class CartControl extends HttpServlet {

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
        HttpSession session = request.getSession();
        String id = "";
        if(session.getAttribute("id") == null){
             id = request.getParameter("id");
        }else{
            id = (String) session.getAttribute("id");
            session.removeAttribute("id");
        }
        //String id = request.getParameter("id");
        //HttpSession session = request.getSession();
        
        session.setAttribute("productIDInCart", id);
        
        DAO dao = new DAO();
        if(dao.getProductByID(id).getAmount() == 0){
            request.getRequestDispatcher("ShopControl").forward(request, response);
            return;
        }
        //lay cookie cu
        Cookie arr[] = request.getCookies();
        String txt = "";
        if (arr != null) {
            for (Cookie o : arr) {
                if (o.getName().equals("id")) {
                    txt = o.getValue();
                    o.setMaxAge(0);//xoa cookie cu di
                    response.addCookie(o);//xoa cookie cu o trinh duyet cua minh
                }
            }
        }
        txt = txt + "," + id;
        //b2: luu id len tren cookie
        //luu id len cart tren cookie
        Cookie c = new Cookie("id", txt);
        c.setMaxAge(60*60);
        //luu cookie o tren browser cococ,chrome,ie
        response.addCookie(c);
        response.sendRedirect("order");
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
