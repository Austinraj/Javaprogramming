/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout_programs;

import java.util.Scanner;

/**
 *
 * @author JeromeInfant
 */
public class ToFIndTheEvenOrOddNumber {
    public static void main(String[]args){
        Scanner c=new Scanner(System.in);
        System.out.println("enter the number");
        int i=c.nextInt();
        if(i%2==0){
            System.out.println("this is even number");
        }else
        {
            System.out.println("odd number");
    }
    }
}
