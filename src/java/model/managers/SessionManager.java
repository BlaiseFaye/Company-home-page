/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.managers;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionManager {
   public static void add(String key, Object value, HttpServletRequest request) {
      getSession(request).setAttribute(key, value);
   }
   public static void destroy(HttpServletRequest request) {
      getSession(request).invalidate();
   }
   private static HttpSession getSession(HttpServletRequest request) {
      return request.getSession(true);
   }
}
