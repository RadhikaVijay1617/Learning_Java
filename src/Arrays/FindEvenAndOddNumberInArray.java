package Arrays;

import Z_Exercises.FindEvenOrOddNumber;

public class FindEvenAndOddNumberInArray {
    public static void main(String[] args) {

        FindEvenAndOdd();
        //FindEvenAndOdd2();
    }

    //Find the Even and Odd number in the array
    public static void FindEvenAndOdd() {
        int a[] = {1, 2, 3, 4, 5, 6};
        int Even = 0;
        int Odd = 0;

        for (int i : a) {
            if (i % 2 == 0) {
                Even = i;
                System.out.println("Even Number:" + Even);
            } else {
                Odd = i;
                System.out.println("Odd Number:" + Odd);
            }
        }
    }

    //Find the Even and Odd number count in the array
    //Find the Even and Odd number in the array
    public static void FindEvenAndOdd2() {
        int a[] = {1, 2, 3, 4, 5, 6, 8, 9, 1, 5};
        int Even = 0;
        int Odd = 0;

        for (int i : a) {
            if (i % 2 == 0) {
                Even++;
            } else {
                Odd++;
            }
        }
        System.out.println("Even Number:" + Even);
        System.out.println("Odd Number:" + Odd);
    }
}
