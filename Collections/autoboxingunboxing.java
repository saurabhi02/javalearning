import java.util.ArrayList;
        /*In java when we use wrapper class like Integer in collection the +=,% are not allowed 
        But when weuse IntValue() method then it is possible 
        consier the program of sum of array 
         */  
public class autoboxingunboxing {

    public static int SumOfArray(ArrayList<Integer> arr)
    {
        int sum=0;
        for(Integer i: arr)
        {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        //  Integer i=10;
        //  i=i+2;
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(4);//Autoboxing converting primitive to objec 5t
        int ans=SumOfArray(arr);
        System.out.println(ans);
        int i =arr.get(2);//UNboxing converting premetive to object 

        System.out.println(arr);

        /*
        Background proessing of Autoboxing

        when we write 
        arr.add(10);//practically we should add an object byt due to defaul
        autoboxing of java it will get accepted 
        internally java is working as 
        arr.add(new Integer(10)) or 
        arr.add(Integer.valueOf(10));

        Background Processig of unboxing 
        when we write 
        arr.get(0) ;??here also it should be object by default unboxing will execute it
        actual working is like 
        arr.get(arr.get(0).Integrvalue())






        */
    }
}
