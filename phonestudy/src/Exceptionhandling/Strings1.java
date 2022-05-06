
//replace function of string 
public class Strings1 {
    public static void main(String[] args) {
        // String s = "Saurabhi ";
        // s=s.replace("Saurabhi", "replacement");
        // System.out.println(s);

        // DIfference between object and string literals 

        String s="abc";
        String s1="abc";

        String s2=new String("abc");
        String s3=new String("abc");
        if(s==s1)
        System.out.println("Same ");
        else 
        System.out.println("NO ");

        if(s2==s3)
        System.out.println("same 2");
        else
        System.out.println("No  ");;
    }
    
}