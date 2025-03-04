package Basics;

import java.util.Scanner;

public class MultipleInputs {
    public static void main(String[]args){
       //MultipleInput1();
       MultipleInput2();
    }
    public static void MultipleInput1(){
        Scanner Scan= new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1 = Scan.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = Scan.nextInt();
        System.out.println("Add 2 numbers:" +(num1+num2));
    }
    //Get user input for multiple datatype
    public static void MultipleInput2(){
        Scanner Scan= new Scanner(System.in);
        System.out.println("Enter First name:");
        String name = Scan.nextLine();
        System.out.println("Enter age:");
        int age = Scan.nextInt();
        System.out.println("Enter any Datatype value");
        Object anytype = Scan.next();
        System.out.println("Enter number1");
        int num=Scan.nextInt();
        Scan.nextLine(); //Need to give this line if we want to get String input after Integer input
        System.out.println("Enter Street name:");
        String street = Scan.nextLine();
        System.out.println("Enter number2");
        int num2=Scan.nextInt();

    }
}
