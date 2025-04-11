             /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java46;

/**
 *
 * @author SMV
 */
public class Java46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=1234;
        int count=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            count++;
            n=n/10;
            
        }
        System.out.println("Count is " + count);
        // TODO code application logic here
    }
    
}
