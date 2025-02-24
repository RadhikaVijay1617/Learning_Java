package Z_Exercises;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
PalindromeEx1();
    }
    public static void PalindromeEx1()

    {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter Palindrome Number:");
        int num = Scan.nextInt();
        int OriginalNumber = num;
        int rev_number = 0;
        while (num!=0){
            rev_number = rev_number*10 + num%10;
            num = num/10;
        }
        if (OriginalNumber==rev_number){
            System.out.println(OriginalNumber + "Palindrome Number");
        }
        else {
            System.out.println(OriginalNumber + "Not Palindrome Number");
        }
    }


}
