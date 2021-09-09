
package Java_oop;
// call stactic non-stactic calling
public class Oop {
     public static void main(String[] args){
         NewClass ob = new NewClass();
         ob.m();
         Oop ob1 = new Oop();
         ob1.abc();
         ob1.abc1();
         abc3();// call stactic non-stactic calling ,,,we call static dont must create object,,
         //have call normal calling( Can direct access)
         
         ////////////////////////////////////////////////
         int x=10;
         int y=20;
         Oop obsum = new Oop();
         int sum = obsum.sum(x, y);
         System.out.println(sum);
         
         ////////////// Method Overloading - different parameters///////////////////
         System.out.println("---------------------Method Overloading - different parameters----------------------------");
         Oop obmethodoverloading = new Oop();
         obmethodoverloading.nima();
         obmethodoverloading.nima(10);
         ////////////// Method Overloading - different datatypes///////////////////
         System.out.println("---------------------Method Overloading - different datatypes----------------------------");
         System.out.println(addTwoNumbers(20,30));
         System.out.println(addTwoNumbers(200L,300l));
     }
     public void abc(){
         System.out.println("New Method");
     }
     public void abc1(){
         System.out.println("New Method 2");
     }
     public static void abc3(){
         System.out.println("New Method stactic method call");
     }
     //////////////////////////////////////////////////////////////
     
      public int sum(int a,int b){
         
          int sum;
          sum=a+b;
          return sum;
     }
      
      ////////////// Method Overloading - different parameters///////////////////
      public void nima(){
         System.out.println("New Method Nima");
     }
      public void nima(int a){
         System.out.println("a="+a);
     }
     ////////////// Method Overloading - different datatypes/////////////////// 
      public static double addTwoNumbers(int x1,int x2){
          double sum=x1+x2;
          System.out.println("This is int method");
          return sum;
        
     }
      public static double addTwoNumbers(long x1,long x2){
          double sum=x1+x2;
          System.out.println("This is Long method");
          return sum;
        
     }
}
