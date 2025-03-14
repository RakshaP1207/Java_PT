/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMV
 */
public class Java10 {
    public static void main(String[] args){
        int num=10;
        if(num%2==0 && num%3==0){
            System.out.println("Java");
        }
        else if(num%2==0){
            System.out.println("Python");
            
        }
        else if(num%3==0){
            System.out.println("C or C++");
        }
        else{
            System.out.println(".Net");
        }
    }
    
}
