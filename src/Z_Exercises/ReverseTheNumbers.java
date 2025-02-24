package Z_Exercises;

import java.util.Scanner;

public class ReverseTheNumbers {

    public static void main(String[] args) {
//ReverseNumEx1();
//ReverseNumEx2();
ReverseNumEx3();

    }
    //Reverse the number using with While loop
    public static void ReverseNumEx1(){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Scan.nextInt();
        int rev = 0;
        while (number!=0)
        {
            rev = rev * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(rev);
    }

    //Reverse the number using with "String Builder"Class
    public static void ReverseNumEx2() {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Scan.nextInt();
        StringBuffer StrBuff = new StringBuffer(String.valueOf(number));
        StringBuffer rev = StrBuff.reverse();
        System.out.println(rev);
    }

    //Reverse the number using with "String Builder"Class
    public static void ReverseNumEx3() {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Scan.nextInt();
       StringBuilder StrBui = new StringBuilder();
       StringBuilder rev = StrBui.append(number);
        System.out.println(rev);
    }

}
