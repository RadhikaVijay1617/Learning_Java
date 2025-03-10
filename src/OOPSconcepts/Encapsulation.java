package OOPSconcepts;
//Wrapping up of data and methods in to a single unit(class).
//All variables should be Private.
//For every variable there should be 2 methods(get&set).
//Variable can be operated only through methods.
public class Encapsulation {

    private int accnonum;
    private String name;
    private double amount;

    public void setAccnonum(int acno){
        this.accnonum = acno;
    }
    public int getAccnonum(){
        return accnonum;
    }
    public void setName(String na){
        this.name=na;
    }
    public String getName(){
        return name;
    }
    public void setAmount(double amo){
        this.amount=amo;
    }
    public double getAmount(){
        return amount;
    }


}
