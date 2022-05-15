class Names implements Comparable<Names>{
    private String name;

    public Names(String names)
    {
        this.name=names;
    }

    @Override
    public int compareTo(Names o) {
        //TODO Auto-generated method stub
        if(name.length()==o.name.length())
        return 2;
        else if(name.length()>=o.name.length())
        return 3;
        else 
        return 4 ;
        
    }

}

public class comparableinterface  {
    
    public static void main(String[] args) {
        Names n=new Names("abc ");
        Names n1=new Names("a");


        int ans=n1.compareTo(n);
        System.out.println(ans);
    }
}
