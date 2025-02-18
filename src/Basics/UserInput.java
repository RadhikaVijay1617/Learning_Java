package Basics;

import java.util.Scanner;

public class UserInput {

    public static void main(String[]args){
        Scanner Scan = new Scanner(System.in);

        String FirstName = Scan.nextLine();
        System.out.println("FirstName:" + FirstName);

        String LastName = Scan.nextLine();
        System.out.println("LastName:" + LastName);

        int age= Scan.nextInt();
        System.out.println("Age:" + age);
    }
}

//If we want to get integer value: use "nextInt"
//If we want to get String value: user "nextline"