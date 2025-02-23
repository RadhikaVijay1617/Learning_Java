package Z_Exercises;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
//        Exmple3();
//        Exmple4();
//        Exmple5();
        Exmple6();

    }

    //Print even numbers between 1 and 10
    public static void Exmple3() {
        int i = 2;
        while (i <= 10) {
            System.out.println(i);
            i += 2; //i= i+2
        }
    }

    //Print even numbers between 1 and 10
    public static void Exmple4() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i += 2; //i= i+2
        }
    }

    //Different Approach - Print even numbers between 1 and 10
    public static void Exmple5() {
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    //Print numbers and say that number is odd or even
    public static void Exmple6() {
        int i = 1;
        while (i <= 10) {
            if(i%2==0){
                System.out.println(i+"Even");
            }
            else {
                System.out.println(i+"odd");
            }
            i++;
        }
    }
}