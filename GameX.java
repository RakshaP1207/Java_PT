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
class Game{
    void play(String name,int n){
        System.out.println("Cricket");}
    void play(int n,String name){
        System.out.println("Football");
    }
    
}
public class GameX{
    public static void main(String[] args){
        Game g=new Game();
        g.play("Dhoni",3);
        g.play(10,"Messi");
    
    
}
}