
package Abstraction;


public class Abstraction {
    
     public static void main(String[] args){
         
         //People people = new People(); // Abstract class walin object hadanna denne na
         People n = new  Engineer( "nimasha",1000);
         System.out.println(n.getIncome());
     }
}
