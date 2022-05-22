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


public class StaticSynchronized {
    public static void main(String[] args) {
        
        CreationMethod cr=new CreationMethod();
       Thread t1=new Thread(new Runnable(){
           long starttime =System.currentTimeMillis();
        @Override
        public void run(){
           // for(int i=0;i<5;i++)
            cr.Display();

            long endttime =System.currentTimeMillis();
            System.out.println("Total time taken by Thread 1 was " +(endttime-starttime));
        }
        
        

       });

       Thread t2=new Thread(new Runnable(){
        long starttime =System.currentTimeMillis();
        @Override
        public void run(){
          //  for(int i=0;i<5;i++)
            cr.Display();
            long endttime =System.currentTimeMillis();
            System.out.println("Total time taken by Thread 2 was " +(endttime-starttime));
            
        }
       });
       t1.start();
       t2.start();
       
        
        
    }
}
