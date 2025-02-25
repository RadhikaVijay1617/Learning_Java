package Z_Exercises;
//Find sum of the given digits (EX: 123 = 6)
public class FindSumOfDigitsInAnumber {
    public static void main(String[]args){

        int num = 1234;
        int sum = 0;

        while (num>0){
            sum =sum+num%10;
            num=num/10;
        }
        System.out.println("Sum of digits in given number:" +sum);
    }


}
