/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java49;

/**
 *
 * @author SMV
 */
public class Java49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=12345;
        int rem=0;
        int mul=1;
        while(n>0){
            rem=n%10;
            mul=mul*rem;
            n=n/10;
            
        // TODO code application logic here
    }
        System.out.println("Multiplied value is "+mul);
    
        // TODO code application logic here
    }
    
}
