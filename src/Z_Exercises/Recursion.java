package Z_Exercises;

public class Recursion {
    public static void main(String[]args){
        RecursionEx1(3);
    }
    public static void RecursionEx1(int count){
        System.out.println("Hello");
        if(count<=1){
            return;
        }
        RecursionEx1(count-1);
    }
}
