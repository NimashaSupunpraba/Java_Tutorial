
package MethodOverriding;

class A{
    int i;
    
    
    public void show(){
        System.out.println("A");
    }
    public void show1(){
        System.out.println("C");
    }

 }
class B extends A{
    int i;
    
    @Override // A class eke thiyena public okoma wage class B ekeyh thiyenwa thiyenawa
    public void show(){
        System.out.println("B");
        super.show();
        i =10;// meke class B ge i thamai wenas wenne
        super.i = 10;// A class eke thina i data eka wenas karanna  on nam mehema call karanna one.
    }

 }
public class MethodOverriding {
    public static void main(String[] args){
      B obj = new B();
      obj.show();
      //obj.show1(); 
    } 
}
