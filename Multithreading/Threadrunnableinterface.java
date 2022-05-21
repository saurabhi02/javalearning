import java.util.*;
import java.lang.Thread;
class ThreadingInterface implements Runnable{

    private int Thread1;
    public ThreadingInterface (int Thread1)
    {
        this.Thread1=Thread1;
    }

    @Override
    public void run() {
        Integer k=50;
        Random r=new Random();
        // TODO Auto-generated method stub
        for(int i=0;i<5;i++)
        {

            System.out.println("value of i "+i+" "+"Value of Thread"+Thread1);
            try {
                Thread.sleep(r.nextInt(500));
            } catch (InterruptedException e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        }
        
    }



    
} 


public class Threadrunnableinterface {
    
    public static void main(String[] args) {
        //For creating thread using Runnale 

      /*
        Thread t1=new Thread(new ThreadingInterface(2));
        Thread t2=new Thread(new ThreadingInterface(3));
        t1.start();
        t2.start();
*/

        // If we want the Thread to be used for only once we can do it by 

      new Thread ( new Runnable()
        {
 
            @Override
            public void run() {
                // TODO Auto-generated method stub
                for(int i=0;i<6;i++)
                {
                    System.out.println(i);
                }
            }

        }).start();
    }
}
