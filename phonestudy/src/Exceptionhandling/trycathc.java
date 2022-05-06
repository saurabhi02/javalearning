
public class trycathc{
    
    
    public static void main(String[] args) {
        int x=0;
        try {
            System.out.println("this is try block "+ 2/x);
        }catch (Exception e ) {
            e.printStackTrace();
            System.out.println("error occured ");
        }
    }
}
