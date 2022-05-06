package localinnerclass;


public class Door {
    public boolean islock(String key)
    {
        class Lock{
            public  boolean islocked(String key)
            {
                if(key.equals("true"))
                return true;
                else 
                return false;

            }
        }
        return new Lock().islocked(key);
    }
    
}
