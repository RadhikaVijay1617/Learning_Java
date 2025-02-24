package Z_Exercises;

public class CountNumberOfEvenAndOddDigits {
    public static void main(String[] args) {
        int num = 34534798;
        int EvenCount = 0;
        int OddCount = 0;
        while (num > 0) {
            int remainder = num % 10;
            if (remainder % 2 == 0) {
                EvenCount++;
            } else {
                OddCount++;
            }
            num = num / 10;
        }
        System.out.println("Even Number count:" + EvenCount);
        System.out.println("Odd Number count:" + OddCount);
    }
}

