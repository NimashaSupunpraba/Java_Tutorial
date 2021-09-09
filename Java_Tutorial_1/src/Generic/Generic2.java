
package Generic;

public class Generic2 {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4};
        display3(intArray);
        Character[] charArray = {'c','g','h','h'};
        display3(charArray);
        
        
    }
    
     private static <T> void display3(T[] array){  // This is Generic method in array
         for(T element:array){
            System.out.printf("%s",element); // Object print karanna printf ganne . 
            //object eka string wa aragena thami element eka string ekak widihata penne.
         }  
         System.out.println();
        
        
    }
}
