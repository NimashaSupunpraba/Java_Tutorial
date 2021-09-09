
package Polymorphism;

import accessModOtherPackage.Pig;


public class Polymorphism {
    
     public static void main(String[] args){
     
    Animal obj1 = new Rabbit(); 
    Animal obj2 = new Dog(); 
    System.out.println(obj1.eat());
    System.out.println(obj2.eat());  // Animal kiyana class ekata eka eka akara thiyenawa
    
     // animal eka eka akara walata pawichchi karana puluwan
     
     //-------------- Access modifier '''''''''''''''''''
     Animal animal = new Animal();
     System.out.println(animal.getAge());
     Dog dog = new Dog();
     System.out.println(dog.getAge());
     
     System.out.println(dog.name);
     
     NotExtends n = new NotExtends();
     System.out.println(n.getName());
     
     Pig p = new Pig();
     System.out.println(p.price());// mwthod ekama one na variable ekenuth puluwan
     
     
     }
     
}
