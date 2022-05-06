import Innerclass.*;
import  java.util.*;

import javax.xml.validation.Schema;
public class Shop {
    public static void main(String[] args) {
        Door d1= new Door();
        Scanner sc=new Scanner(System.in);
        boolean lck =sc.nextBoolean();
        d1.getlock().setLock(lck);
        d1.Shopstatus();
        sc.close();
        

    }
}
