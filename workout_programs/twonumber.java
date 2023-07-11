/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout_programs;
import java.util.Scanner;
public class twonumber {
    public static void main (String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("input first number:");
        int num1=input.nextInt();
        System.out.println("input second number:");
        int num2=input.nextInt();
        System.out.println(num1 *  num2);
    }
}
