
package Polymorphism;


public class Animal {
    private int age = 5; // inheritance karath wena ewata meka nikanma access karanna denne na. method eka haraha ona acess karanna.
    String name = "nimasha"; // meka default wagemai    default String name = "nimasha"; 
    //default walata dammahama , subclass wala acccess karanna puluwan package wala ba
    protected double price = 10.9;
    public int getAge(){
        return this.age;
    }
     public String eat(){
         return "Animal Eating Foods.";
     }
}
