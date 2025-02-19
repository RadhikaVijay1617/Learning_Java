package Operators;

public class IncrementAndDecrementOperators {
    public static void main(String[]args){
        IncrementOperators();
        DecrementOperators();
    }
    public static void IncrementOperators(){
      //++ is called increment operator
        int a = 10;
        a++;  //a=a+1;
        System.out.println(a); //11

        int PostResult = a++; //Post Increment
        System.out.println(PostResult); //11
        System.out.println(a); //12

        int PreResult = ++a; //Pre Increment
        System.out.println(PreResult); //13
        System.out.println(a); //13
    }
    public static void DecrementOperators(){
        //-- is called decrement operator
        int a = 10;
        a--;  //a=a-1;
        System.out.println(a); //9

        int PostResult = a--; //Post decrement
        System.out.println(PostResult); //9
        System.out.println(a); //8

        int PreResult = --a; //Pre decrement
        System.out.println(PreResult); //7
        System.out.println(a); //7
    }
}
