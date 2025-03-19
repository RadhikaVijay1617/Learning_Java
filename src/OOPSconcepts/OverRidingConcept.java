package OOPSconcepts;

public class OverRidingConcept {
    public static void main(String[]args){
        Bank obj1 = new Bank();
        System.out.println(obj1.RateOfInterest());

        SBI obj2 = new SBI();
        System.out.println(obj2.RateOfInterest());

        ICICI obj3 = new ICICI();
        System.out.println(obj3.RateOfInterest());
    }
}

class Bank{
    double RateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    double RateOfInterest(){
        return 10.2;
    }
}
class ICICI extends Bank {
    double RateOfInterest(){
        return 5.2;
    }
}