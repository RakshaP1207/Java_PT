/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java60;

/**
 *
 * @author SMV
 */
public class Uma implements Person {
    @Override
    public void eat(){
        System.out.println("Uma loves to eat sweet");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Uma u=new Uma();
        System.out.println(u.age);
        u.eat();
        // TODO code application logic here
    }
    
}
