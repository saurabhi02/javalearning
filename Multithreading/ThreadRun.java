class Runing implements Runnable{

    @Override
    public void run() {
        System.out.println("************************");
        for(int i=0;i<5;i++)
        {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(i);

        }
        
    }

}

public class ThreadRun{

    public static void main(String[] args) {
        
        Thread t1=new Thread(new Runing());
        Thread t2=new Thread(new Runing());
    
        System.out.println("name of Thread 1 "+t1.getName());
        t1.setName("Saurabhi");
        System.out.println("Changed name of Thread 1 "+t1.getName());
        System.out.println("Changed name of Thread 1 "+t1.getPriority());
        System.out.println("Changed name of Thread 2 "+t2.getPriority());
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        t2.start();
    }
   

}