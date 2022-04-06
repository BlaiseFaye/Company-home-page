/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.managers;
import java.util.ArrayList;
import model.execption.UserNotInDataException;
import model.javabean.User;


public class UserManager {
   private static ArrayList<User> users;
   static {
      users = new ArrayList<>();
      users.add(new User(0, "Peter Sokolowski", "peter", "1234"));
      users.add(new User(1, "April Mcdonald", "april", "1234"));
      users.add(new User(2, "Isabel Lapointe", "isabel", "1234"));
      users.add(new User(3, "Blaise Faye", "bfaye", "1234"));
   }
   public static User isUser(User userToTest) throws UserNotInDataException {
      User retour = null;
      for (User user : users) {
         if (user.getLogin().equals(userToTest.getLogin()) && user.getPassword().equals(userToTest.getPassword())) {
            retour = user;
            break;
         }
      }
      if (retour == null) {
         throw new UserNotInDataException();
      }
      return retour;
   }
}
