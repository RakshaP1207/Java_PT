/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java56;

/**
 *
 * @author SMV
 */
import java.util.Scanner;
public class Java56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=input.nextInt();
        long factorial=1;
         for(int i=1;i<=num;i++){
             factorial*= i;
         }
        System.out.println("Factorial of "+num+ " is:"+factorial);
        // TODO code application logic here
    }
    
}
