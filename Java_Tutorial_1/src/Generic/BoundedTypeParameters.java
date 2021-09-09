
package Generic;


public class BoundedTypeParameters {
    public static void main(String[] args) {
        //display3("GihanCharuka");
        display3(11);
        //display3('X');
        display3(20.9);
        display3(12L); // mewa puluwan numbers walata
        //display3(true);
    }
    
     private static <T extends Number> void display3(T value){  // This is Generic method 
         //numbers type eke ewa withari parameters walin pass karanna puluwan.
        System.out.println(value);
        System.out.println(value.getClass().getName());
    }
}
