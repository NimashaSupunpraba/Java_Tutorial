
package Encapsulation;


public class Dog extends Animal {
     public int getAge(){
        return super.getAge();
    }
    
    public String eat(){
         return "Dogs eats meat.";
     }
    public String name(){
        return super.name;
    }
    public double price(){
        return super.price;
    }
}
