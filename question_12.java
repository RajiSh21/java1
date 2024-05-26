/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labsheet_1;

/**
 *
 * @author rajis
 */


 class super
{
  super1()
    {
          System.out.println("this is class super1 "); 
    }

}

class sub extends super
{
   
    void show()
    {
         super s=new super();
         System.out.println("this is subclass "); 
    }

}

public class question_12 {
     public static void main(String[] args) {
         sub t=new sub();
         t.show();
     }
    
}
