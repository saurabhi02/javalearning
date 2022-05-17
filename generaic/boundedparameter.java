/*
Bounded parameter means suppose that we created a generic class or method which should only except a particular
data type for that case we used bounded parameter 
*/
class Printarray{
public static <E extends Number> void display(E[] array)
{
    //The above metod extend number class so it will only expect number 
    for(E ele:array)
    System.out.println(ele);

}
}
public class boundedparameter{

    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5,6};
        Printarray p=new Printarray();
        p.display(arr);// here the display works fine 

      /*
        String [] arr1={"saur","ram"};
        p.display(arr1); on uncommenting it will show error message because type is restricted 

        */
    }
}