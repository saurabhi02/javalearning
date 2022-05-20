import javax.swing.event.SwingPropertyChangeSupport;
import javax.swing.plaf.synth.SynthScrollBarUI;

/*t = types 
 v = value
 e = element
 n=number
 k=key

*/

class pair<k,v> {
    private k key;
    private v val;
    public pair(k key, v val)
    {
        this.key=key;
        this.val=val;
    }

    public k getkey()
    {
        return key;

    }
    public v getval()
    {
        return val;
    }
}




public class GenericParameters {
    public static void main(String[] args) {
        pair<Integer,Integer> p=new pair<>(1,2);
        System.out.println(p.getkey()+" "+p.getval());
        
    }
        
}
