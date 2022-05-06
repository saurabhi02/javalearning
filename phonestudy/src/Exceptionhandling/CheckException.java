
import java.util.*;
public class CheckException {
    
    public  void method1(int x,int y){
        try{
            System.out.println(x/y);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error in program ");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter numbers ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        CheckException c= new CheckException();
        c.method1(x,y);

    }
}
