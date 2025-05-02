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
public class Prgm3 {
    public static void main(String[] args){
        String s1="java developer";
        String s2="Java Tester";
        System.out.println(s1.contains("ava"));
        System.out.println(s1.contains(s2));
        System.out.println(s1.startsWith("java"));
        System.out.println(s2.startsWith("java"));
        System.out.println(s1.endsWith("per"));
        System.out.println(s2.endsWith("developer"));
    } 
    
}
