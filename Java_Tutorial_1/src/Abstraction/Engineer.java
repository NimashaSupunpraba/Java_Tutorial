
package Abstraction;


public class Engineer extends People { 

    public Engineer(String name, double cash) {
        super(name, cash);
    }
// conceriet class 

    @Override 
    public double getIncome() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        return super.getCash()*30;
    }
    
// ekko class eka abstact karanna one . Nathnam method eka overriding karanna weno
    
}
