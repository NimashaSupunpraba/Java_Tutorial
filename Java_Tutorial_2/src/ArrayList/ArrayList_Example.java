
package ArrayList;
import java.util.ArrayList;
import java.util.List;
import ArrayList.model.Student;
import java.util.ListIterator;

public class ArrayList_Example {

   
    public static void main(String[] args) {
       //List<String> names = new ArrayList<String>(); // hadanakota size ekak denne na
       ArrayList<String> names = new ArrayList<String>();// me widihatath hadanna puluwan
       names.add("Chamod");
       names.add("Supun");
       names.add("Supun");
        System.out.println(names);
         System.out.println(names.size());
         names.add(1,"nipuni");
         names.add(1,"nipuni");//Dublicate values thiya ganna puluwan
         System.out.println(names);
         System.out.println(names.contains("Supun"));// hariyatama nam denna ona. simple capital seen eka balapanawa.
         //names.clear();
         System.out.println(names);
         System.out.println(names.size());
         System.out.println(names.get(1));
         System.out.println(names.indexOf("nipuni"));
         
         System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
         names.remove("nipuni");
          System.out.println(names);
         System.out.println(names.indexOf("nipuni"));
          names.remove(2) ;
          System.out.println(names);
         System.out.println(names.indexOf("nipuni"));
       
       for(String name:names){
           System.out.println(name);
       }   
           System.out.println("-------------New Example----------------");
           ArrayList<Student> students = new ArrayList<>();
           
           Student st1 = new Student();
           st1.setName("Nimasha");
           st1.setAge(18);
           students.add(st1);
           
           Student st2 = new Student();
           st2.setName("Himasha");
           st2.setAge(28);
           students.add(st2);
           System.out.println(students);
           System.out.println(students.get(0).getName());
       
            ListIterator<Student> myStudent = students.listIterator();
            while(myStudent.hasNext()){
                Student st = myStudent.next();
                System.out.println("Name :"+ st.getName());
                System.out.println("Name :"+ st.getAge());
            }
       
    }
    
}
