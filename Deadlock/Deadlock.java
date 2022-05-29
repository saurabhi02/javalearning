import java.util.concurrent.SynchronousQueue;

public class Deadlock {
    public static void main(String[] args) {
        String Lock1 ="Lock1";
        String Lock2 = "Lock 2";

        Thread t1=new Thread(new Runnable(){
            @Override
           
                public void run()
            {
                synchronized (this) {
                System.out.println("Inside Thread 1 Lock 1");
                    synchronized (this)
                    {
                        System.out.println("Inside thread 1 Lock 2");
                    }
            }


            }

        });
        Thread t2=new Thread(new Runnable(){
            @Override
            public void run()
            {
                synchronized (Lock2) {
                System.out.println("Inside Thread 2 Lock 1");
                    synchronized (Lock1)
                    {
                        System.out.println("Inside thread 2 Lock 2");
                    }
            }


            }


        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        System.out.println("In main thread ");

    }

}
