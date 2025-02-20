package Exercises;

import java.util.Scanner;

public class FindEvenOrOddNumber {
    public static void main(String[]args){

        Scanner Scan = new Scanner(System.in);
        int num = Scan.nextInt();

        if (num%2==0){
            System.out.println("Given number is a even number");
        }
        else {
            System.out.println("Give number is a odd number");
        }
    }
}
