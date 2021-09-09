
package Interface;


public class PersonE implements CommonPerson{
     //;;;;;;;;;;;; interface example second;;;;;;;;;;;;;;;;;;;
    String name = "Supunpraba";
    int age = 23;
    String password="abc";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
