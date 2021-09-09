
package java_tutorial;

public class WrapperClasses {
    
    public static void main(String[] args){
        String x = "Nimasha";
        int y = 9;
        Integer c = Integer.valueOf(20); //Integer c =20;
        System.out.println(c);
        Double z = 3.4;
        Boolean b = true;
        
        Integer  k = null; // mehema null value declare karannath puluwan
        //''''''' primitive type ekek wrapping class ekak karana eka
        int n = 12;
        Integer m = Integer.valueOf(n); // boxing , wrapping
        Integer v = n; // auto boxing , auto wrapping
        
        //''' wrapping class  ekak primitve path kirima
        Integer p = 4;
        int g = p.intValue(); // Unboxing , Unwrapping
        int h = p; // auto unboxing , auto Unwrapping
        
    }
    
}
