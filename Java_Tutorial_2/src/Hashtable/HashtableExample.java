
package Hashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashtableExample {
   public static void main(String[] args) {
       Hashtable<Integer,String> ht = new Hashtable<>();
      ht.put(1, "Kamal");
        ht.put(2, "Nimal");
         ht.put(1, "Hinene");
       //Integer nill;
        //ht.put(null, "Hinene");
      System.out.println(ht);
       System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
        Hashtable<Integer,Student> hts = new Hashtable<>();
        Student st1 = new Student();
        st1.setName("Kamal");
        st1.setAge(5);
        hts.put(1, st1);
        Set set = hts.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()){
            Map.Entry<Integer,Student> me=(Map.Entry<Integer,Student>) i.next();
            System.out.println(me.getKey());
            System.out.println(me.getValue().getName());
           System.out.println(me.getValue().getAge());
        }
   
       
   } 
}
