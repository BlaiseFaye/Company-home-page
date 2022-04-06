/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlers;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.execption.UserNotInDataException;
import model.javabean.User;
import model.managers.SessionManager;
import model.managers.UserManager;


@WebServlet(name = "UserControler", urlPatterns = {"/user"})
public class UserControler extends HttpServlet {
   /**
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    *
    * @param request servlet request
    * @param response servlet response
    * @throws ServletException if a servlet-specific error occurs
    * @throws IOException if an I/O error occurs
    */
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      // 1
      String urlRetour = "WEB-INF/error.jsp";
      String action = request.getParameter("action");
      String login = request.getParameter("login");
      String pwd = request.getParameter("pwd");
      //2
      if (action != null) {
         switch (action) {
            case "isuser":
               try {
               User uFromData = UserManager.isUser(new User(login, pwd));
               SessionManager.add("user", uFromData, request);
               urlRetour = "WEB-INF/portail.jsp";
            } catch (UserNotInDataException ex) {
               Logger.getLogger(UserControler.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "logout":
               SessionManager.destroy(request);
               urlRetour = "login.jsp";
               break;
         }
      }
      //3
      request.getRequestDispatcher(urlRetour).forward(request, response);
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
