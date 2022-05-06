import localinnerclass.Door;
import java.util.*;
public class Shop1 {
    public static void main(String[] args) {
        Door d = new Door();
        Scanner sc=new Scanner(System.in);
        String lockstatus=sc.nextLine();
        boolean s=d.islock(lockstatus);
        if(s==true)
        {
            System.out.println("Shop is open ");

        }
        else
        System.out.println("Shop is close ");
       sc.close();
    }
}
