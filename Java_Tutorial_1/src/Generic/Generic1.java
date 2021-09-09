
package Generic;


public class Generic1 {
    
    public static void main(String[] args) {
        System.out.println(display());
        display1("GihanCharuka");
        display1(11);
        display3("GihanCharuka");
        display3(11);
        display3('X');
        display3(20.9);
        display3(12L);
        display3(true);
    }
    
    private static String display(){
        return "NimashaSupunpraba";
    }
    private static void display1(String value){
        System.out.println(value);
    }
    private static void display1(Integer value){
        System.out.println(value);
    }
    private static <T> void display3(T value){  // This is Generic method
        System.out.println(value);
        System.out.println(value.getClass().getName());
    }
}
