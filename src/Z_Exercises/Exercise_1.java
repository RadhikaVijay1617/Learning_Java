package Z_Exercises;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = Scan.nextInt();

        // Print the pattern
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("?");
            }
            System.out.println("#");
        }

        for (int i = number - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("?");
            }
            System.out.println("#");
        }

        Scan.close();
    }
}

