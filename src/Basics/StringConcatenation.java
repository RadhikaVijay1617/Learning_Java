package Basics;

import java.util.Scanner;

public class StringConcatenation {

    public static void main(String[]args){
        //StringCom();
        //TwoStringCom();
        //StringComWithIfElse();
        //StringComWithIfElse2();


    }
    public static void StringCom(){
        String FirstName = "Radhika";
        String LastName = "Vijay";
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println(FirstName + LastName);
        System.out.println(FirstName + " " +LastName);
        System.out.println(FirstName+" "+LastName +a+b+c);
        System.out.println(FirstName+" "+LastName +" "+a+b+c);
        System.out.println(FirstName+" "+LastName +" "+(a+b+c));
        System.out.println(FirstName.concat(LastName));
        System.out.println(FirstName.concat(LastName).concat("5"));
    }

    //Compare two strings
    public static void TwoStringCom(){
        String a = "Orange";
        String b = "Orange";
        String c = b;
        System.out.println(a == c);

        String Str1 = new String("Orange");
        String Str2 = new String ("Orange");
        String Str3 = Str1;
        System.out.println(Str1.equals(Str3)); // we should compare like this if we want compare two string.(need to use .equals method)
    }
    //Get an input from user to compare string using IF Else condition
    public static void StringComWithIfElse(){
        Scanner Scan = new Scanner(System.in);
        String RCB = Scan.nextLine();
        if (RCB.equals("Win")){
            System.out.println("Ee sala cup Namdhey");
        }
        else  {
            System.out.println("cup illa");
        }
    }
    public static void StringComWithIfElse2(){
        Scanner Scan = new Scanner(System.in);
        String Meghana = Scan.nextLine();
        if (Meghana.equals("dead")){
            System.out.println("Surya meets Ramya");
        }
        else  {
            System.out.println("Surya weds meghana");
        }
    }
}
