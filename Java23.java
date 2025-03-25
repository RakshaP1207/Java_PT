/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java23;

/**
 *
 * @author SMV
 */
public class Java23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j && j<=n/2 || i+j==n-1 && j>=n/2 || j==n/2 && i>=n/2){
                System.out.print("*"+" ");
            }
                else{
                     System.out.print(" "+" ");
                }
                    
                }
            System.out.println();
        }
        
        // TODO code application logic here
    }
    
}
        // TODO code application logic here
    
    
