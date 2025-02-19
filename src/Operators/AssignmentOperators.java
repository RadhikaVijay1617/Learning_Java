package Operators;

public class AssignmentOperators {
    public static void main(String[]args){
        AssignmentOp();
    }
    public static void AssignmentOp(){
       int a=10;

        a+=2; //a=a+2 (12)
        System.out.println(a);

        a-=2; //a=a-2 (10)
        System.out.println(a);

        a*=2; //a=a*2 (20)
        System.out.println(a);

        a/=2; //a=a/2 (10)
        System.out.println(a);

        a%=2; //a=a%2 (0)
        System.out.println(a);

    }
}
