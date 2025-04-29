/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java58;

/**
 *
 * @author SMV
 */
public class Java58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr={11,13,9,96,99,45,4};
        int maxIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[0]>arr[maxIndex]){
                maxIndex=i;
            }
        }
        System.out.println(maxIndex);
        
    
}
}
