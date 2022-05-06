import Staticvariable.*;
import Staticvariable.Static1.Inner;
public class Static3 {
    public static void main(String[] args) {
    
        Inner.setI(3);
        System.out.println(Inner.getI());

        
        System.out.println(Inner.getI());
        Inner.setI(5);

        System.out.println(Inner.getI());
      
    }
}
    

