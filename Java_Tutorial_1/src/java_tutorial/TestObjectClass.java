
package java_tutorial;

public class TestObjectClass extends Student{
    public static void main(String[] args){
        TestObjectClass  obj = new TestObjectClass ();
        Student s = new Student();
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o2;
        System.out.println(o1.equals(o2));
        System.out.println(o3.equals(o2));
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o1.toString());
        System.out.println(o1);  // object eka print wenne. toString method eka auto ma call weno
        System.out.println(o1.getClass());
        System.out.println(s.getClass());
    } 
}

class Student extends Object{
    String name = "kamal";
    int age = 15;
    void run(){
    
    }
    void eat(){
    
    }
}
