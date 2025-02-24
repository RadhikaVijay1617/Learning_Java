package Z_Exercises;

public class CountNumberOfDigitsInNumber {
    public static void main(String[]args){
        HowManyDigits();
    }
    //Find how many digits in a given number(34567 - 5digits)
    public static void HowManyDigits(){
        int num=564324;
        int count = 0;
        while (num>0){
            num = num/10;
            count++;
        }
        System.out.println("Number of Digits:" + count);

    }
}
