
package labsheet_1;

/**
 *
 * @author rajis
 */
public class QN_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       abc a=new abc(20);
          abc b=new abc(20, 22);
    }
    
}
class abc
{
    abc(int age)
    {
        System.out.println("age= "+age); 
    }
     abc(int age,int batch)
    {
        System.out.println("age= "+age); 
        System.out.println("batch= "+batch); 
    }
    
}
