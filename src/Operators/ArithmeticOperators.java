package Operators;
//Arithmetic operators (+, -, *, /, %).

public class ArithmeticOperators {
    public static void main(String []args){
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println("Addition: " + (a+b+c));
        System.out.println("Subtraction: " + (b-a));
        System.out.println("Multiplication: " + (a*b*c));
        System.out.println("Division: " + (c/a)); //Return coent
        System.out.println("Modulo Division: " + (b%a)); //Return remainder

    }
}
