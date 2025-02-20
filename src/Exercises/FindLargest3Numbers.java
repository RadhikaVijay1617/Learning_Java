package Exercises;

public class FindLargest3Numbers {
    public static void main(String[]args){

        int num1 = 30;
        int num2 = 20;
        int num3 = 10;

        if ((num1>num2)&&(num1>num3)){
            System.out.println("num1 is a greatest number");
        }
        else if ((num2>num1)&&(num2>num3)){
            System.out.println("num2 is a greatest number");
        }
        else{
            System.out.println("num3 is a greatest number");
        }
    }
}
