import java.util.ArrayList;

import java.util.*;
public class Arraylistprac {
    
    static ArrayList<String> array=new ArrayList<String>(10);

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i =0;i<n;i++)
        {
           String u = sc.next();
           array.add(u);
        }

        for(int i=0;i<n;i++)
        System.out.print(array.get(i)+" ");
        System.out.println();
        //remove by index
        array.remove(2);
        for(int i=0;i<array.size();i++)
        System.out.print(array.get(i)+" ");
        System.out.println();

        //remove by object 
        array.remove("saurabhi");
        for(int i=0;i<array.size();i++)
        System.out.print(array.get(i)+" ");
        
    
        

    }
}
