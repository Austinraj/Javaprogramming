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
public class FactoricalNumder {
    public static void main(String[]args){
        int count=1;
        for(int i=1;i<=9;i++){
            count=count*i;
        }
        System.out.println(count);
    }
}
