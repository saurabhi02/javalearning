
import java.util.*;

public class Iterators1 {
  
    public static void main(String[] args) {
        ArrayList<Integer> lst=new ArrayList<>();
        
        lst.add(6  );
        lst.add(2);
        lst.add(8);
        Iterator<Integer> it=lst.iterator();//We need to create iterator after addin element in collectione 

        System.out.println(it.next());// next() method return the first element in collection 

        // for looping using iterators we used While loop 
        //it we have some where used it.next() then the current balue will be nect element that is secomd element 
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        lst.sort(null);
       for(Integer i:lst)
        {
            System.out.print(i+" ");
        }

        String s=new String("a");
        String s1=new String("c ");
        int c=s1.compareTo(s);
        System.out.println(c);
        if(s1==s)
        System.out.println("yes");
        else
        System.out.println("No");

    }

}
