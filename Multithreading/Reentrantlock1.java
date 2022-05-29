import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reentrantlock1 {
    static int counter=0;
    public static void main(String[] args) {
        
        Lock newLock=new ReentrantLock();

        Thread t1= new Thread (new Runnable(){
            @Override

            public void run()
            {
                try {
                    newLock.lock();
                for(int i=0;i<1000;i++)
                counter++;
                } finally {
                    //TODO: handle exception
                    newLock.unlock();   
                }
                
                            
            }

        });

        Thread t2= new Thread (new Runnable(){
            @Override

            public void run()
            {

                try {
                    newLock.lock();
                for(int i=0;i<1000;i++)
                counter++;
                } finally {
                    //TODO: handle exception
                    newLock.unlock();   
                }

            }

        });

        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Value of counter is "+ counter);


    }
}
