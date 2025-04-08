/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java44;

/**
 *
 * @author SMV
 */
public class Java44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int left=arr.length/2;
        int right=arr.length-1;
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
               
        // TODO code application logic here
    }
    
}
