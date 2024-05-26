/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labsheet_1;

/**
 *
 * @author rajis
 */
  class b  extends Thread
{

    @Override
    public void run() {
    
    for(int i=0;i<4;i++)
    {
        System.out.println("Rabin pandey");
    }
    
}
}
public class QN_20 {
    public  static void main(String []args) 
     {
         b r=new b();
         Thread t=new Thread(r);
         t.start();
          for(int i=0;i<4;i++)
    {
        System.out.println("Rabin");
    }
    
}}
