package ControlStructures;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String []args){
        IfElseEX1();
        IfElseEX2();
        IfElseEX3();


    }

    //If Else Statement
    public static void IfElseEX1()
    {
        boolean rain = false;
        if(rain)
        {
            System.out.println("Take an umbrella");
        }
        else
        {
            System.out.println("Enjoy the sun light");
        }
    }
    public static void IfElseEX2()
    {
        int a =10;
        int b =30;
        if (a>b)
        {
            System.out.println("a greater than b");
        }
        else
        {
            System.out.println("a less than b");
        }
    }
    public static void IfElseEX3()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scan.nextInt();
        System.out.println("Enter second number:");
        int b = scan.nextInt();
        if (a==b)
        {
            System.out.println("both numbers are equal");
        }
        else
        {
            System.out.println("both numbers are not equal");
        }
    }
}
