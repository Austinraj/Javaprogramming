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
public class SumOfEvenNumber {
    public static void main(String[]args){
        int count=0;
        for(int i=1;i<=100;i++){
        if(i%2==0){
            count =count+i;
        }
    }
        System.out.println(count);
    }
}
