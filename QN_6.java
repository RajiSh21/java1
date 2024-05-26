
package labsheet_1;

import java.util.Scanner;

/**
 *
 * @author rajis
 */
public class QN_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc=new Scanner (System.in);
          System.out.print("enter bikename :");
          String bname=sc.next();
           System.out.print("Enter price:");
          int price=sc.nextInt();
            System.out.println(bname+" cost "+price); 
     }
    
}
  