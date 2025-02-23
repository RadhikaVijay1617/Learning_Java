package ControlStructures;

//3 important steps : initialization, condition, increment/decrement
public class DoWhileLoop {
    public static void main(String[] args) {
        //DoWhileEx1();
        DoWhileEx2();
    }

    //Increment 1 to 10 in ascending order
    public static void DoWhileEx1() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    //Decrement 10 to 1 in decending order
    public static void DoWhileEx2() {
        int i = 10;
        do {
            System.out.println(i);
            i--;
        } while (i >= 0);
    }
}














