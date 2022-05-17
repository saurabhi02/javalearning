import java.util.*;
public class Sets {
    public static <E> void display(Set<E> ele)
    {
        for(E i:ele)
        System.out.println(i);
    }
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<>();//has set store uniqueu element doesn't guarantee order 
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);

        display(s);   
        s.remove(2);//to remove element 
        display(s);  
        boolean present=s.contains(3);
        System.out.println(present);

        //Types of set 
        //1. Hashset 
        //2. linkedHashSet maintain order of insertion 
        System.out.println("Linked Hash Set ");
        Set<Integer> s1=new LinkedHashSet<>();
        s1.add(4);
        s1.add(2);
        s1.add(5);
        display(s1);

        //3. Sorted Hash Set Stores elemetn in sorted form 
        System.out.println("Sorted set ");
        SortedSet<Integer> s2=new TreeSet<>();
        s2.add(8);
        s2.add(1);
        s2.add(20);
        display(s2);

        //4. Treeset in this storage is done in tree acees is fast 
        Set<Integer> s3=new TreeSet<>();

        




    }
}
