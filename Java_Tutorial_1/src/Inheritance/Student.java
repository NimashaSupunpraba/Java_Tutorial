
package Inheritance;

// Human class eke thiyena okkoma ewa student ekata eno method and attributes

public class Student extends Father{ //subclass
    int id = 1;
    
    public void print(){
        System.out.println("name " + name);
        System.out.println(id);
        System.out.println(age);
        System.out.println(FatherName);
    }
}
