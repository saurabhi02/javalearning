import java.util.*;
public class LinkedLists {
    

    public static void display(LinkedList<Integer> lst)
    {
        for(Integer i : lst)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList<Integer>  lst=new LinkedList<>();//Declaration of linked list 
        //method /operation of linked list 
        lst.add(10);
        lst.add(20);
        lst.add(30);//to add at the end 
        display(lst);
        lst.add(1,35);
        display(lst);
        //to update value of node
        lst.set(0,45);
        display(lst);

        //to remove element from linked list
        /* 
        So there are various way to remove element from the list 
        removeLast();
        removeFirst()
        remove(index);
        remove (); // also remove frist element 
        
        */



    }
}
