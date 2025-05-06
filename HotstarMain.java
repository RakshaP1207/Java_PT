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
abstract class Hotstar{
    void login()
    {
        System.out.println("Login Successful");
    
    }
    abstract void watch();
}
class Hotstarfree extends Hotstar
{
    @Override
    void watch()
    {
        System.out.println("Watch with adds");
    }
}
class HotstarPremium extends Hotstar
{
    @Override
    void watch()
    {
        System.out.println("Watch without adds");
    }
}
public class HotstarMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hotstarfree hf=new Hotstarfree();
        hf.login();
        hf.watch();
        HotstarPremium hp=new HotstarPremium();
         hf.login();
        hf.watch();
        
        
        // TODO code application logic here
    }
    
}
