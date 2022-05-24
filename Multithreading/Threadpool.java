import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.plaf.synth.SynthSeparatorUI;

class ThreadPool1 extends Thread{

    private String name;
    public ThreadPool1(String name)
    {
        this.name=name;
    }
    @Override
    public void run()
    {
        System.out.println("Started thread"+ name);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("thread ended "+ name);

    }

}

public class Threadpool {
   public static void main(String[] args) {
       ExecutorService e= Executors.newFixedThreadPool(3);
    ThreadPool1 t1=new ThreadPool1("Thread 1");
    ThreadPool1 t2=new ThreadPool1("Thread 2");
    ThreadPool1 t3=new ThreadPool1("Thread 3");
    ThreadPool1 t4=new ThreadPool1("Thread 4");
    ThreadPool1 t5=new ThreadPool1("Thread 5");
    ThreadPool1 t6=new ThreadPool1("Thread 6");
   e.execute(t1);
   e.execute(t2);
   e.execute(t3);
   e.execute(t4);
   e.execute(t5);
   e.execute(t6);
   e.execute(t4);
   e.shutdown();
   }



}
