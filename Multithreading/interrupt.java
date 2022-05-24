class Bank {
    public static int balance;
    void withdarw(int ammount)
    {
       synchronized(this){ 
        if(balance<=0)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                System.out.println("Interruption occur ");
                return ;
            }
        }
    }
        balance =balance-ammount;
        System.out.println("withdrwal successfull ");
        
    }

}

public class interrupt {
    public static void main(String[] args) {
        Bank b=new Bank();
       
        Thread t1=new Thread(new Runnable(){

            @Override
            public void run() {
                // TODO Auto-generated method stub
             b.withdarw(4900);   
            }

        });
        t1.start();
       t1.interrupt();
    }
}
