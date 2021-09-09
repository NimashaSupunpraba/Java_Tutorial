
package accessModOtherPackage;

import Polymorphism.Animal;


public class Pig extends Animal{
    Animal animal1 = new Animal();
    
//    public int getAge(){
//        return animal.age;
//        
//   }
//     public String getName(){
//        return animal.name;
//        
//   }
     public double price(){
       return super.price;
       
    }
    
      public static void main(String[] args){
          Animal animal = new Animal();
          System.out.println(animal.getAge());
      
      }
}
