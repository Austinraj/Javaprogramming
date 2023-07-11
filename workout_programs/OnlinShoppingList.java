/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout_programs;

/**
 *
 * @author JeromeInfant
 */
public class OnlinShoppingList {
    public void myaccount(){
        System.out.println("MY ACCOUNT");
    }
    public void catalog(){
        System.out.println("my car list");
    }
    public void orders(){
        System.out.println("my orders");
    }
    public void myWhishList(){
        System.out.println("MY WHISH LIST");
    }
    public static void main(String[]args){
      OnlinShoppingList info=new OnlinShoppingList();
      info.myaccount();
      info.catalog();
      info.orders();
      info.myWhishList();
    }
}
