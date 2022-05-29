class CreationMethod{
     
    synchronized static public void Display()
     {
       
         for (int i=1;i<=5;i++)
         {
             System.out.println("Value of i " + i);
         }
         System.out.println("Thread completed ");
        
         
     }


}


public class SynchronizedBlock {
    public static void main(String[] args) {
        
        CreationMethod cr=new CreationMethod();//Oject 1
        CreationMethod cr2=new CreationMethod();//Object2


       Thread t1=new Thread(new Runnable(){
           long starttime =System.currentTimeMillis();
        @Override
        public void run(){
           // for(int i=0;i<5;i++)
           System.out.println("Thread 1");
            cr.Display();

            long endttime =System.currentTimeMillis();
            //System.out.println("Total time taken by Thread 1 was " +(endttime-starttime));
        }
        
        

       });

       Thread t2=new Thread(new Runnable(){
        long starttime =System.currentTimeMillis();
        @Override
        public void run(){
          //  for(int i=0;i<5;i++)
          System.out.println("Thread 2");
            cr.Display();
            long endttime =System.currentTimeMillis();
          //  System.out.println("Total time taken by Thread 2 was " +(endttime-starttime));
            
        }
       });

       Thread t3=new Thread(new Runnable(){
        long starttime =System.currentTimeMillis();
     @Override
     public void run(){
        System.out.println("Thread 3");
        // for(int i=0;i<5;i++)
         cr2.Display();

         long endttime =System.currentTimeMillis();
         //System.out.println("Total time taken by Thread 3 was " +(endttime-starttime));
     }
     
     

    });


    Thread t4=new Thread(new Runnable(){
        long starttime =System.currentTimeMillis();
     @Override
     public void run(){
        // for(int i=0;i<5;i++)
        System.out.println("Thread 4");
         cr2.Display();

         long endttime =System.currentTimeMillis();
        //n System.out.println("Total time taken by Thread 4 was " +(endttime-starttime));
     }
     
     

    });

       t1.start();
       t2.start();
       t3.start();
       t4.start();
       
        
        
    }
}

