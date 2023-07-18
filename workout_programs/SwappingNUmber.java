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
public class SwappingNUmber {
    public static void main(String[]args){
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("the number");
        a=s.nextInt();
        b=s.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("Swapping numbers are");
        System.out.println(a);
        System.out.println(b);
        
    }
}
