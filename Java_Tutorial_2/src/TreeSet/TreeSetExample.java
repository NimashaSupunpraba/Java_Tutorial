
package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("chje");
        ts.add("cggg");
        ts.add("jykte");
        ts.add("jykte"); // eka unique value ekai thiyenna puluwan
        ts.add("chfnhmfgn");
        System.out.println(ts); // api dana data tika hada ganne asending order ekata
        
        Iterator it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
