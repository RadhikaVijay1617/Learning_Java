package Basics;

public class EscapeSequence {
    public static void main(String[]args){
        System.out.println("Hello \n World"); //New Line
        System.out.println("Hello \t World"); //Tab
        System.out.println("Hello \\ World"); //Backslash
        System.out.println("He said,\"Hi\""); //Double Quote
        System.out.println("it\'s okay"); //single quote
        System.out.println("Hello \r World"); //Carriage Return
        System.out.println("Hello\bWorld"); //Backspace
        System.out.println("Hello\fWorld");//Form Feed
        System.out.println("\u0041(prints'A')");
    }

}
