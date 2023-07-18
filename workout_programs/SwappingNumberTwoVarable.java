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
public class SwappingNumberTwoVarable {
    public static void main(String[]args){
        int a,b;
        Scanner sw=new Scanner(System.in);
        System.out.println("enter the number");
        a=sw.nextInt();
        b=sw.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("SwappingNumber");
        System.out.println(a);
        System.out.println(b);
    }
}
