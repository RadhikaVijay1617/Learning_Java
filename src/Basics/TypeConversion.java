package Basics;

public class TypeConversion {
    public static void main(String []args){
        ImplicitCasting();
        ExplicitCasting();
    }
    //Implicit casting

    public static void ImplicitCasting(){
        int a =10;
        double b=a;
        System.out.println(a);
        System.out.println(b);
    }
    public static void ExplicitCasting(){
        double a =10.345;
        int b=(int)a;
        System.out.println(a);
        System.out.println(b);
    }
}
