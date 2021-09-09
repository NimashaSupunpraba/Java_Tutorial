
package Generic;

class Test<T , U>{
    private T obj;
    private U obj1;
    Test(T obj,U obj1){
        this.obj=obj;
        this.obj1=obj1;
    }
    
//    public T getObject(){
//        return this.obj;
//    }
    public void print(){
        System.out.println("Obj " + this.obj);
        System.out.println("Obj1 " + this.obj1);
    }
}

public class Generic3Class {
    
    public static void main(String[] args) {
        Test<String,Integer> sObj = new Test<String,Integer>("Nimasha Supunpraba",12);
        sObj.print(); 
        //Test<String> sObj = new Test<String>("Nimasha Supunpraba");
        //System.out.println(sObj.getObject());
        //Test<Integer> iObj = new Test<Integer>(111);
        //System.out.println(iObj.getObject());
        
        
        System.out.println();
       display3("GihanCharuka");
        display3(11);
        display3('X');
        display3(20.9);
        display3(12L);
        display3(true); 
    }
    
    private static <T> void display3(T value){  // This is Generic method
        System.out.println(value);
        System.out.println(value.getClass().getName());
    }
}
