import java.util.*;
public  class arraylist{
    public static void display(ArrayList<Integer> arr)
    {
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println("************************");
    }
    public static void display1(ArrayList<String> arr)
    {
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        System.out.println("************************");
    }
    public static void main(String arg[])
    {
        ArrayList <Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4); 
        display(arr);
        //Removing an object 
        ArrayList<String> arr1=new ArrayList<>();
        arr1.add("Saurabhi");
        arr1.add("Ram");
        display1(arr1);
        arr1.remove("Ram");
        display1(arr1);


        

    }
}