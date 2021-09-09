
package PriorityQueue;

import java.util.PriorityQueue;


public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> pQ = new PriorityQueue<String>();
        //System.out.println(pQ.peek()); //expection ekak deno
        System.out.println(pQ.poll());
        //System.out.println(pQ.remove());
         //System.out.println(pQ.element()); //expection ekak deno . peek eki element ekei wenasa
        pQ.add("nimasha");
        pQ.add("Gihan");
        pQ.add("nipuni");
        System.out.println(pQ.peek());
        System.out.println(pQ.element());
        System.out.println(pQ); 
         System.out.println(pQ.remove());
         //System.out.println(pQ.poll());
         pQ.offer("nipuni");
         pQ.offer("Gihan");
        System.out.println(pQ); //api mona widihata data dammath eya priority ekak hada gena data piliwela auto hada gannawa
    }
    
    
}
