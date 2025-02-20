package Exercises;

public class Swap_Two_Numbers {
    public static void main(String[]args){
        //SwapwithTem();
        //SwapWithArithmetic1();
        SwapWithArithmetic2();
    }
    public static void SwapwithTem(){
        int a = 101;
        int b= 201;
        System.out.println("a value: " + a);
        System.out.println("b value: " + b);

        int temp = a;
        a = b;
        b=temp;
        System.out.println("a value: " + a);
        System.out.println("b value: " + b);
    }
    public static void SwapWithArithmetic1(){
        int a = 10;
        int b= 20;
        System.out.println("a value: " + a);
        System.out.println("b value: " + b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a value: " + a);
        System.out.println("b value: " + b);

    }
    public static void SwapWithArithmetic2(){
        int a = 14;
        int b= 10;
        System.out.println("a value: " + a);
        System.out.println("b value: " + b);

        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("a value: " + a);
        System.out.println("b value: " + b);

    }
}
