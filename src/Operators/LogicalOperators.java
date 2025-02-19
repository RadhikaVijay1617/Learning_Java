package Operators;
//Logical operators && || !
// works between 2 boolean values
//Return only boolean value - True/False
public class LogicalOperators {
    public static void main(String[]args){
        boolean a1 = 10>20; //false
        boolean b1 = 20>10; //true

        System.out.println(a1&&b1); //false
        System.out.println(a1||b1); //true
        System.out.println(!a1);
        System.out.println(!b1);

        System.out.println((20>10)&&(30>10)); //true - we can use expression directly
        System.out.println((20>10)||(30>10)); //true
        System.out.println(!(30>10)); //false
    }
}
