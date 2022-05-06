package Staticvariable;

public class Static1 {
    
    public static class Inner{
     public static int i = 0;

    public static  int getI() {
        return i;
    }

    public static  void setI(int i) {
        Inner.i = i;
    };
}
    


}
