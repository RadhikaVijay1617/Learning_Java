package Basics;

import java.util.Scanner;

public class UserInput {

    public static void main(String[]args){
        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String FirstName = Scan.nextLine();  //we can user Scan.nextLine() or Scan.next()
        System.out.println("FirstName:" + FirstName);

        System.out.println("Enter Last Name:");
        String LastName = Scan.next();
        System.out.println("LastName:" + LastName);

        System.out.println("Enter Age:");
        int age= Scan.nextInt();
        System.out.println("Age:" + age);

        System.out.println("Enter Double Number:");
        double num = Scan.nextDouble();
        System.out.println("Double Number:" + num);
    }
}

//If we want to get integer value: use "nextInt"
//If we want to get String value: user "nextline"