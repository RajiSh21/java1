
package labsheet_1;

/**
 *
 * @author rajis
 */
public class QN_16 {
    public static void main(String[] args) {
        try {
            // Example of code that might throw multiple types of exceptions
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("Accessing element at index 10: " + numbers[10]); // This will throw ArrayIndexOutOfBoundsException
            
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("Result of division: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block for ArrayIndexOutOfBoundsException
            System.out.println("Array index out of bounds: " + e);
        } catch (ArithmeticException e) {
            // Catch block for ArithmeticException
            System.out.println("Arithmetic exception: " + e);
        }

        // Continue execution after handling the exceptions
        System.out.println("Program continues after the try-catch blocks.");
    }
}

