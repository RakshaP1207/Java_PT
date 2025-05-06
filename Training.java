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
public class Training implements Jpracticals,Tpracticals{
    @Override
    public void javaTraining()
    {
        System.out.println("Training students on Java");
    }
    public void testingTraining()
    {
        System.out.println("Training students on Manual & Automation Training ");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Training t=new Training();
        t.javaTraining();
        t.testingTraining();
    }

}
