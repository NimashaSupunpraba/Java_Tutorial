package Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println(v.capacity());
        System.out.println(v.size());
        for (int i = 0; i < 12; i++) {
            v.addElement(i);
        }
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.size());

        for (int i = 0; i < 12; i++) {
            v.addElement(i);
        }
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.size());

        for (int i = 0; i < 12; i++) {
            v.addElement(i);
        }
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.size());

        for (int i = 0; i < 12; i++) {
            v.addElement(i);
        }
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.size());

        Vector<String> v1 = new Vector<String>();
        v1.addElement("nipuni");
        v1.addElement("supun");
        v1.addElement("supun");
        // v1.addElement(4);
        System.out.println(v1);
        System.out.println(v1.indexOf("supun"));
        System.out.println(v1.firstElement());
        System.out.println(v1.lastElement());
        System.out.println(v1.elementAt(0));
        System.out.println(v1.remove("supun"));
        System.out.println(v1);
        
        for (String element :v1){
            System.out.println(element);
        }
        System.out.println("jjjjjjjjjjjjj");
        Enumeration e = v1.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
