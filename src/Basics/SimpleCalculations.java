package Basics;

import java.util.Scanner;

public class SimpleCalculations{
    public static void main(String[]args){

        Add3Numbers();
        UseThreeVariables();
        GetIntAndString();
    }
//Get 3 integer and do add/sub/mul/div
    public static void Add3Numbers(){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter First Number");
        int X = Scan.nextInt();
        System.out.println("Enter Second Number");
        int Y = Scan.nextInt();
        System.out.println("Addition:");
        int Add = X+Y;
        System.out.println(Add);
        System.out.println("Subtraction:");
        int Sub = X-Y;
        System.out.println(Sub);
        System.out.println("Multiplication:");
        int Mul = X*Y;
        System.out.println(Mul);
        System.out.println("Division:");
        int Div = X/Y;
        System.out.println(Div);
    }
    //Get input for 3 integer variables: a,b and c. Now multiply all variable and store it in d. Now add all variable and store it in e. Now divide d by e.
    public static void UseThreeVariables(){
        Scanner Scan = new Scanner(System.in);
        int a = Scan.nextInt();
        int b = Scan.nextInt();
        int c = Scan.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        System.out.println(d/e);
    }
    //Get input for 3 variables: Name, Score, department. Let the user enter the score for 100 marks, you convert it for 10 and print it.

    public static void GetIntAndString(){
        Scanner Scan = new Scanner(System.in);

        String Name = Scan.nextLine();
        double Score = Scan.nextDouble();
        Scan.nextLine();
        String Department = Scan.nextLine();
        System.out.println("Name: " + Name);
        System.out.println("Score: " + Score/10 +"/10");
        System.out.println("Department: " + Department);
    }
}

//NOTE: Need to give "Scan.nextLine()" if we want to get user input as a string next to integer
