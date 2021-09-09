
package TreeMap;

import java.util.TreeMap;


public class TreeMapEsample {
    public static void main(String[] args) {
        TreeMap<String,String> tm = new TreeMap();
        tm.put("name","Charuka");
        tm.put("name","Charuka"); 
         tm.put("age","Charuka"); 
          tm.put("ag",null); 
          System.out.println(tm); 
          tm.remove("age");
       // tm.put(null,"Charuka"); hashmap eke key eka null karala thiya ganna puluwan mekath ba
        System.out.println(tm);
        System.out.println(tm.containsKey("name"));
        System.out.println(tm.containsKey("age"));
        tm.replace("name", "Nimasha Supunpraba ");
        System.out.println(tm);
    }
}
