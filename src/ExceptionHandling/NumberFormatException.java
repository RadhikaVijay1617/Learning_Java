package ExceptionHandling;

public class NumberFormatException {
    public static void main(String[]args){
        String s = "2334234";
        //String s = "Welcome";  // if we use "Welcome'(alphabets) instant of numbers, system throw Number format exception
        int num = Integer.parseInt(s);
        System.out.println(num);

        System.out.println("Program is completed...");
        System.out.println("Program is exited...");
    }
}
