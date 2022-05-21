
class CreationMethod{
     
    synchronized public void Display()
     {
         for (int i=1;i<=5;i++)
         {
             System.out.println("Value of i " + i);
         }
         System.out.println("Thread completed ");
     }


}


public class SynchronizedMethod {
    public static void main(String[] args) {
        
        CreationMethod cr=new CreationMethod();
       Thread t1=new Thread(new Runnable(){
        @Override
        public void run(){
           // for(int i=0;i<5;i++)
            cr.Display();

            
        }
        
       });

       Thread t2=new Thread(new Runnable(){
        @Override
        public void run(){
          //  for(int i=0;i<5;i++)
            cr.Display();

            
        }
       });
       t1.start();
       t2.start();
       
        
        
    }
}
