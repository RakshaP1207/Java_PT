/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java42;

/**
 *
 * @author SMV
 */
public class Java42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] n={1,7,5,3,4};
        int max=0;
        for(int i=0;i<n.length;i++){
            if(max<n[i]){
                max=n[i];
                
            }
         
        }
        System.out.println(max);
        // TODO code application logic here
    }
    
}
