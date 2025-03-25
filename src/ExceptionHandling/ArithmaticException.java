package ExceptionHandling;

import java.util.Scanner;

public class ArithmaticException {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number;");
        int num = scan.nextInt();
        System.out.println(num/0); //System will throw ArithmeticException

        int a[] = new int[5];
        System.out.println("Enter the position(0-4):");
        int pos = scan.nextInt();

        System.out.println("Enter the value:");
        int value = scan.nextInt();
        a[pos] = value;
        System.out.println(a[pos]);


    }
}
