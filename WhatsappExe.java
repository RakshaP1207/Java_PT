/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java58;


    
    

class WhatsappV1 

{

 void deliveryReport()

 {

 System.out.println("Single Tick");

 }

 void chat()

 {

 System.out.println("Texting");

 }

}



class WhatsappV2 extends WhatsappV1

{

 @Override

 void deliveryReport()

 {

 super.deliveryReport();

 System.out.println("Double Tick");

 }

 void calling() 

 {

 System.out.println("Voice/Video Calling");

 }

}



class WhatsappV3 extends WhatsappV2

{

 @Override

 void deliveryReport()

 {

 super.deliveryReport();

 System.out.println("Blue Tick");

 }

 void status()

 {

 System.out.println("Status Updation");

 }

}

public class WhatsappExe 

{

 public static void main(String[] args) {

 WhatsappV3 wa = new WhatsappV3();

  

 wa.deliveryReport();

 wa.chat();

 wa.calling();

 wa.status();

  

 }

}

    
    
