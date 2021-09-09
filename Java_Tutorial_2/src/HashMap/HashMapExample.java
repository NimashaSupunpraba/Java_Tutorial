
package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"Nimasha");
        //hm.put(1,"Himasha");
        hm.put(2,"Nimni");
        hm.put(3,"charu");
        hm.put(null,"Saman");
         hm.put(6,null);
        System.out.println(hm);
        Set set = hm.entrySet();
        System.out.println(set);
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry me = (Map.Entry) it.next();
            System.out.println("Key : "+me.getKey() );
            System.out.println("Value : "+me.getValue() );
        }
    }
}
