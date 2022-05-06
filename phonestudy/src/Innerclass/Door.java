package Innerclass;

public class Door {
    private Lock lock;
    public Door() {
        lock= new Lock(true);
    }
    public Lock getlock()
    {
        return this.lock;
    }
    public void Shopstatus()
    {
        if(lock.isLock())
        {
            System.out.println("Closed ");

        }
        else{
            System.out.println("Open ");
        }
    }

    public class Lock{
        private boolean lock;
        public Lock(boolean lock) {
            this.lock=lock;
        }

        public boolean isLock() {
            return this.lock;
        }

        public void setLock(boolean lock) {
            this.lock = lock;
        } 
        
    }
    
}
