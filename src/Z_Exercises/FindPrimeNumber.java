package Z_Exercises;

import java.util.Scanner;

//Natural Number >1
//Which has only 2 factors 1 and itself
//19--> Prime number
//28 --> 1,2,4,7.... Not a prime number
public class FindPrimeNumber {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scan.nextInt();
        int count = 0;

        if (num>1) {
            for (int i = 1; i <= num; i++)
            {
                if (num % i == 0)
                    count++;
            }
                if (count == 2)
                {
                    System.out.println("Given number is a Prime number");
                } else {
                    System.out.println("Given number is not a Prime number");
                }
            }
        else {
            System.out.println("Given number is not a Prime number");
        }

    }
}
