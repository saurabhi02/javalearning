import java.util.*;
public class Stacks {

    static void display(Stack<Integer> sta,String s)
    {
        System.out.println("Stack after "+s);
        for(int i:sta)
        {
            System.out.print(i+" ");
        }
        System.out.println();

    }
    public static void main(String args[])
    {
        Stack<Integer> sta=new Stack<>();//declaration 
        //Methods;
        Scanner sc=new Scanner(System.in);
        sta.push(2);// to add item in stac
        sta.push(3);
        sta.push(8);
        sta.push(7);
        String s="Push";
        display(sta,s);
        s="Pop";
        sta.pop();//will remove the top most element of the stack
        display(sta,s);
        if(sta.isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        System.out.println("Stack have element ");

        System.out.println("Enter value to be searched ");
        int val=sc.nextInt();
        int find=sta.search(val);
        System.out.println("Element found at" + find);
        //the last added element will be at position 1 



    }
}
