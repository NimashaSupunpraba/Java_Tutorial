
package Abstraction;


public abstract class People {
    
    private String name;
    private double cash;
    
    People(String name,double cash){
        this.cash= cash;
        this.name= name;
    }
    
    public abstract double getIncome();

 
    public String getName() {  //concert methods
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

  
    public double getCash() {
        return cash;
    }

    
    public void setCash(double cash) {
        this.cash = cash;
    }
}
