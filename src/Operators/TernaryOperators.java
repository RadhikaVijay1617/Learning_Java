package Operators;

//Syntax: Var = exp? result1:result2;
public class TernaryOperators {

    public static void main(String[]args){
        int a=200, b=100;

        int x = (a>b)? a:b;
        System.out.println(x); //If expression is true, the first value(200) will return

        int y = (a<b)? a:b;
        System.out.println(y); //If expression is false, the second value(100) will return

        Example2();
    }
    public static void Example2(){
        int person_age = 10;
        String res = (person_age >20)? "Eligible":"Not Eligible";
        System.out.println(res);
    }
}
