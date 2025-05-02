/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java59;

/**
 *
 * @author SMV
 */
public class StrongNumbers {
    public static void main(String[] args){
        int num=145;
        int rem=0;
        int ans=0;
        int temp=num;
        while(num>0){
            rem=num%10;
            int fact=1;
            for(int i=rem;i>=1;i--){
                fact=fact*i;
            }
            ans=ans+fact;
            num=num/10;
        }
        if(ans==temp){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
        
    }
    
}
