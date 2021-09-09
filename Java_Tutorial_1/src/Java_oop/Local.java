
package Java_oop;

public class Local {
    static int j= 20; // non static variable reference denna ba static method wala
    //Golabl Variable
    public static void main(String[] args){
        int i = 10;//Local variable
        System.out.println(i);
        System.out.println(j);
        sum();
    }
    public static void sum(){
        //System.out.println(i); not use this method
        System.out.println(j);
    }
}
