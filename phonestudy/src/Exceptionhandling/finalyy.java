import java.util.*;

public class finalyy {
    public static void main (String args[])
    {
       
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter x and y ");
        int x=sc.nextInt(),y=sc.nextInt() ;

        try{
            System.out.println("print this "+ x /y );
        }
        catch(Exception e) {
            System.out.println("No ");

        }
        finally{
            System.out.println("this is block ");
        }
        System.out.println("Hi ");
    }
}
