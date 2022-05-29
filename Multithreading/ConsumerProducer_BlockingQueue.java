import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
class Producer implements Runnable {

    private ArrayBlockingQueue<Integer> Queue;
    public Producer(ArrayBlockingQueue<Integer> Queue)
    {
        this.Queue=Queue;
    }

    @Override
    public void run() {
        while(true)
        {
        try {
            Thread.sleep(1000);
            Queue.put(ConsumerProducer_BlockingQueue.counter++);
            System.out.println("element in queue "+ ConsumerProducer_BlockingQueue.counter);
        }catch (InterruptedException e) {
            //TODO: handle exception
            e.printStackTrace();

        }
    }



        // TODO Auto-generated method stub
        
    }

}

class Consumer implements Runnable {

    private ArrayBlockingQueue<Integer> Queue;
    public Consumer(ArrayBlockingQueue<Integer> Queue)
    {
        this.Queue=Queue;
    }

    @Override
    public void run() {
        while(true)
        {
        try {
            Thread.sleep(3000);
            Queue.take();
            ConsumerProducer_BlockingQueue.counter--;
            System.out.println("consumer consumed  in queue "+ ConsumerProducer_BlockingQueue.counter);
        }catch (InterruptedException e) {
            //TODO: handle exception
            e.printStackTrace();

        }
    }



        // TODO Auto-generated method stub
        
    }

}

public class ConsumerProducer_BlockingQueue {
    static  int counter=0;
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<>(10);
        Producer p=new Producer(q);
        Thread t1= new Thread (p);
        Consumer  c=new Consumer(q);
        Thread t2= new Thread (c);
        t1.start();
        t2.start();
    }
}
