/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labsheet_1;

/**
 *
 * @author rajis
 */
public class QN_18 {
     public static void main(String[] args) {
         try {
             int a = 8;
             int b = 0;
             int c = a / b;
             throw new ArithmeticException(); // throwing an ArithmeticException explicitly
         } catch (ArithmeticException e) {
             System.out.println("Error: Division by zero");
         }
     }
    
}

