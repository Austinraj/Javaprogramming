/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout_programs;


public class StudentInfo {
    public void studentname(){
        System.out.println("name:raj");
    }
    public void studentmark(){
        System.out.println("mark:370/500");
    }
    public void studentaddress(){
        System.out.println("address:chennai");
   
    }
    public static void main(String[]args){
        StudentInfo info=new StudentInfo();
        info.studentname();
        info.studentmark();
        info.studentaddress();
    }
            
     }
