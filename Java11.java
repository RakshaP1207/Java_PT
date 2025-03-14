/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMV
 */
public class Java11 {
    public static void main(String[] args){
        int age=65;
        if(age<12){
            System.out.println("Minor Ticket");
        }
        else if(age>=12 && age<=60){
            System.out.println("Normal Ticket");
        }
        else if(age>60){
            System.out.println("Major Ticket");
        }
        
    }
    
}
