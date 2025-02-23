package Z_Exercises;

public class FindLargest3Numbers {
    public static void main(String[] args) {
        Largest3Numbers();
        Smallest3Numbers();
    }
    public static void Largest3Numbers() {
        int num1 = 30;
        int num2 = 20;
        int num3 = 10;

        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("num1 is a greatest number");
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("num2 is a greatest number");
        } else {
            System.out.println("num3 is a greatest number");
        }
    }

    public static void Smallest3Numbers() {
        int num4 = 20;
        int num5 = 10;
        int num6 = 30;

        if ((num4 < num5) && (num4 < num6)) {
            System.out.println("num4 is a smallest number");
        } else if ((num5 < num4) && (num5 < num6)) {
            System.out.println("num5 is a smallest number");
        } else {
            System.out.println("num6 is a smallest number");
        }

    }
}
