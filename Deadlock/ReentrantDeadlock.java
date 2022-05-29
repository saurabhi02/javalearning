import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class ReentrantDeadlock1 {
    
    public static void main(String[] args) {
        Lock l1=new ReentrantLock();
        Lock l2=new ReentrantLock();

        Thread t1=new Thread(new Runnable(){

            @Override
            public void run()
            {
                boolean flaglock1=false;
                boolean flaglock2=false;
            while(true){
                try{
                  //  flaglock1=l1.tryLock(10,TimeUnit.Millisecond);
                    //flaglock2=l2.tryLock(10,TimeUnit.Millisecond);
                }
                catch (InterruptedException e){
                    e.printStackTrace();

                }finally{
                    if(flaglock1==true)
                    System.out.println("Inside thread 1 lock 1");
                    if(flaglock2==true)
                    System.out.println("Inside thread 1 lock 1");
                    if(flaglock1==true && flaglock2==true)
                    System.out.println("Inside thread 1 lock 1");
                }

            }
        }


        });
    }
}
