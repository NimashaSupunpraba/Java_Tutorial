
package Java_Exception_Handling;

import java.util.Scanner;

public class Exceptionhandling{
   public static void main(String[] args){
       
          System.out.println("Enter Number");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
       try{
         
            int x = 6/i; //critical statement
            System.out.println(x);
                //String s = null;
                // System.out.println(s.length());
       
               
            
       }catch(Exception e){
           
            System.out.println(e);
            System.out.println("Error Occures");
       }
       
       System.out.println("New Method");
   } 
}
