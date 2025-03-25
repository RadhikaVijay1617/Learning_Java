package ExceptionHandling;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the position(0-4):");
        int pos = scan.nextInt();

        System.out.println("Enter the value:");
        int value = scan.nextInt();
        a[pos] = value;
        System.out.println(a[pos]); //If we enter position as more than 4, system throw "ArrayIndexOutOfBoundsException"
    }
}
