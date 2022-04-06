/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.execption;


public class UserNotInDataException extends Exception {
   public UserNotInDataException() {
      super("Ce User n existe pas");
   }
}
