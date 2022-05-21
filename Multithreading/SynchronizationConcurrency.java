import java.lang.Thread;
import java.util.*;
public class SynchronizationConcurrency {
    public static int count=0;
    public static void main(String[] args) {
        
        Thread t1= new Thread(new Runnable()
        {
           @Override
           public void run()
           {
            for(int i=1;i<1000;i++)
            SynchronizationConcurrency.count++;
           }
        });
        
        Thread t2= new Thread(new Runnable()
        {
           @Override
           public void run()
           {
            for(int i=1;i<1000;i++)
            SynchronizationConcurrency.count++;
           }
        });
       

        t1.start();
        t2.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(count);// The output of this shoul be 2000 but we won't get it due to 
        //The fact te count is shared variable 
    }
}
