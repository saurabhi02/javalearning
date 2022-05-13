import java.util.*;
public class ListInterface {

    public static void display(List<Integer> lst)
    {
        for(Integer i: lst)
        System.out.print(i+" ");

        System.out.println();
    }
    public static void main(String[] args) {
        
        
        List<Integer> lst=new ArrayList<>();
        lst.add(4);
        lst.add(1);
        lst.add(7);
        lst.add(2);
        display(lst);


    }
}
