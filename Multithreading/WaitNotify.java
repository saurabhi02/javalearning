
class Bank {
        public static int balance=0;

        public void withdarw(int ammount)
        {
            synchronized (this){
                if(balance <= 0 )
            {
                try {
                    wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
            }
            }
            balance = balance - ammount;
            System.out.println("Balance Withdrawen ");
        

        }
   

        public void deposite(int ammount )
        {
            System.out.println("Ammount is getting added to account ");
            balance=balance + ammount;
            
            synchronized (this) {    
            notifyAll();
            
            }
        }
}

public class WaitNotify {
    
        public static void main(String[] args) {
            
            Bank b=new Bank();
            Thread t1=new Thread(new Runnable(){

                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    b.withdarw(2000);
                    
                }


            });
            

            Thread t2=new Thread(new Runnable(){

                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    b.deposite(3000);
                   
                    
                }
                

            });
            t1.start();
            t2.start();
            
        }
}
