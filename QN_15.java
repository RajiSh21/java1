/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labsheet_1;

/**
 *
 * @author rajis
 */
public class QN_15 {
    public static void main(String[] args) {
        // Array of integers
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            // Trying to access an element outside the array bounds
            System.out.println("Accessing element at index 10: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the ArrayIndexOutOfBoundsException
            System.out.println("Exception caught: " + e);
        }

        // Continue execution after handling the exception
        System.out.println("Program continues after the try-catch block.");
    }
}

