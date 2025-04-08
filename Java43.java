/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java43;

/**
 *
 * @author SMV
 */
public class Java43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] n={2,7,5,3,4};
        int min=n[0];
        for(int i=1;i<n.length;i++){
            if(min>n[i]){
                min=n[i];
                
            }
         
        }
        System.out.println(min);
        // TODO code application logic here
    }
    
}
