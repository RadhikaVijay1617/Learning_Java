package Basics;
//Upcasting - converting value from lower to higher
//int  ---> long
//float ---> double
//Downcasting - converting value from higher to lower
//long ---> int
//double --->float
public class TypeCasting {
    public static void main(String[]args){
        //Upcasting();
        Downcasting();

    }
    public static void Upcasting(){
        int intvalue = 100;
        long longvalue = intvalue;
        System.out.println(longvalue);

        float floatvalue = 200;
        double doublevalue = floatvalue;
        System.out.println(floatvalue);

        int intvalue2=250;
        double doublevalule2 = intvalue2;
        System.out.println(doublevalule2);
    }
    public static void Downcasting(){
        long longvalue1=1000;
        int intvalue1=(int)longvalue1;
        System.out.println(intvalue1);

        double doublevalule3=430.50;
        int intvalue3=(int)doublevalule3;
        System.out.println(intvalue3);





    }
}
