

public class array {

    public static void fun1(int a[])
    {
        for(int i=0;i<a.length;i++)
        a[i]=1;

    }
    
    public static void fu1(int i)
    {
        i=9;
        System.out.println(i + " ");
    }
    public static void main(String[] args) {
        int a[]=new int[5];
        // fun1(a);
        // for(int i:a)
        // System.out.print(i+" ");
        int i=10;
        System.out.println(i);
        fu1(i);
        System.out.println(i);

        
        
        
    }
    
}
