import java.util.*;

class Mycounter{
    private int thread ;

    public Mycounter(int thread) {
        this.thread = thread;
    }

    public void Count(){
        for(int i=1;i<10;i++)
        System.out.println("The value of i is "+i+"The value of thread is "+thread);
    }
    
}

class MycounterThread extends Thread{
    private int thread ;

    public MycounterThread(int thread) {
        this.thread = thread;
    }

    @Override
    
    public void run() {
        Count();
    }

    public void Count(){
        for(int i=1;i<10;i++)
        {  
        try{
            sleep(100);

        } 
        catch(Exception e)
        {
            System.out.println("error accoured ");
        }
        System.out.println("The value of i is "+i+"The value of thread is "+thread);
        }
    }
    
}

public class ThreadCreation {
    public static void main(String[] args) {
/*
        Mycounter firstthread=new Mycounter(1);
        Mycounter secondthread=new Mycounter(2);

        firstthread.Count();
        System.out.println("+++++++++++++++++++++++++++++++");
        secondthread.Count();
//The output of above code is not multi tasking as first thread complete its execution then second starts
  */      

  // Now in the second class Mycountthread is multitasking 
  MycounterThread m1= new MycounterThread(1);
  MycounterThread m2=new MycounterThread(2);
  // m1.run(); using run will also not give mult tasking as run is need to be performed by JVM 
  m1.start();
  System.out.println("+++++++++++++++++++++++++++++++++++");
 // m2.run();
  m2.start();


    }
    
}
