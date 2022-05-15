
class NonGeneric{
    private Object o;
    public NonGeneric(Object o)
    {
        this.o=o;
    }
    public Object getObj()
    {
        return o;
    }
    
    
}
class Generic<t>{
    private t var;
    public Generic(t var)
    {
     this.var=var;   
    }

    public t getobj()
    {
        return var;
    }
}


public class GnericClassNot {
    public static void main(String[] args) {
        NonGeneric n=new NonGeneric("as");
        String s=(String) (n.getObj());
        System.out.println(s);

        /* In the aove code as we are using Object then also we have to 
         do type casting in line 19 
         So its not generic and alsNames n=new Names("abc ")o the time for the conversion is too much 
         there comes the NON generic programin (I.E class and methods )

         */   

         Generic<Integer> n1=new Generic<>(2);
         int ans=n1.getobj();
         System.out.println(ans);
         Generic<String> n2=new Generic<>("saur");
         System.out.println(n2.getobj());
         /*s
         Here without typecasting we are free to use any data type object 
         */

    }
}
