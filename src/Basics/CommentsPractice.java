package Basics;

import java.util.Scanner;

public class CommentsPractice {
    public static void main(String[] args) {

        Add3Numbers();

    }

    //Get 3 integer and do add/sub/mul/div
    public static void Add3Numbers() {
        Scanner Scan = new Scanner(System.in);
        //System.out.println("Enter First Number");
        int X = Scan.nextInt();
        System.out.println("Enter Second Number");
        int Y = Scan.nextInt();
        /*System.out.println("Addition:");
        int Add = X + Y;
        System.out.println(Add);
        System.out.println("Subtraction:");
        int Sub = X - Y;
        System.out.println(Sub);
        System.out.println("Multiplication:");*/
        int Mul = X * Y;
        System.out.println(Mul);
        System.out.println("Division:");
        int Div = X / Y;
        System.out.println(Div);
    }
}