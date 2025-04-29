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
class Amazon{
    void payment(){
        System.out.println("COD");
    }
    void payment(String name){
        System.out.println("UPI Payment");
    }
    void payment(long cardnumber,int otp){
        System.out.println("Card Payment");
    }
     void payment(String username,String password){
        System.out.println("Net Banking");
    }
    
}
public class AmazonX{
    public static void main(String[] args){
        Amazon a=new Amazon();
        a.payment();
        a.payment("payment");
        a.payment(12345,18);
        a.payment("ABC","password");
    }
    
}
