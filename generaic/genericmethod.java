import java.util.*;
class Method{
 public <E> void print(List<E> lst){
     for(E element:lst){
         System.out.println(element+" ");
     }
        
    }
}

// generic method that can expected any data type
public class genericmethod {
    public static void main(String[] args) {
        System.out.println("Integer  list print using same method ");        
    List<Integer> lst1=new ArrayList<>();
    lst1.add(1);
    lst1.add(2);
    lst1.add(3);
    Method m=new Method();
        m.print(lst1);
    
    System.out.println("String list print using same method ");    
    List<String> lst2=new ArrayList<>();
    lst2.add("saurabhi");
    lst2.add("reema");
    lst2.add("niddi");
    lst2.add("ayesha ");
    //Lst 2 is of type string still we cann call it using 
    m.print(lst2);
    }
}
