
package LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
   public static void main(String[] args) {
       LinkedList li = new LinkedList();
       li.add("c");
       li.add("f");
       li.addLast("A");
       li.addFirst("S");
       li.add(1,"D");
       System.out.println(li);
       li.removeFirst();
       System.out.println(li);
       li.removeLast();
       System.out.println(li);
       System.out.println(li.removeLast());
       System.out.println(li);
       Object v1=li.get(1);
       System.out.println(v1);
       li.set(1,(String) v1+" Changed Value");
       System.out.println(li);
   } 
}
