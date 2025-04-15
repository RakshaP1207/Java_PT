/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author SMV
 */

public class Student {
    int age=10;
    String name="Tom";
    void read(){
        System.out.println("Read");
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student S=new Student();
        System.out.println(S.age);
        System.out.println(S.name);
        // TODO code application logic here
    }
    
}
