package Basics;

public class TypeConversion {
    public static void main(String []args){
        ImplicitCasting();
        ExplicitCasting();
    }
    //Implicit casting - We can do only Widening Casting that means go big to small data type casting
    //byte -> short -> char -> int -> long -> float -> double

    public static void ImplicitCasting(){
        int a =10;
        double b=a;
        System.out.println(a);
        System.out.println(b);
    }
    //Explicit Casting - We can do Narrowing Casting that means go small to big data type casting
    //double -> float -> long -> int -> chat -> short -> byte
    public static void ExplicitCasting(){
        double a =10.345;
        int b=(int)a;
        System.out.println(a);
        System.out.println(b);
    }
}
