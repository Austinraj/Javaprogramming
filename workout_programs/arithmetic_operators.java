/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout_programs;

import java.util.Scanner;
public class arithmetic_operators {
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("input first number:");
        int a=input.nextInt();
        System.out.println("input second number:");
        int b=input.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
