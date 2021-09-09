
package Interface;


//public class A extends B,C { // interface me akarayata kipayakma inheritance karanna puluwan
public class A implements Person,Person1  { // class walata interface ekak inheritan karanna one nam implement kiyana eka yoda ganne
 
   // static int a =10;

    @Override
    public String getName() {
        return "nimasha";
    }
}
