/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java29;

/**
 *
 * @author SMV
 */
public class Java29 {
    static int sq(int a){
        return a*a;
    }
    static int cb(int b){
        int ans=b*b*b;
        return ans;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Program Starts");
        System.out.println(sq(2));
        System.out.println(cb(3));
        System.out.println("Program Ends");
              
        // TODO code application logic here
    }
    
}
