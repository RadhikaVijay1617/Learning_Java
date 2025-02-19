package Basics;

public class BasicOutPutFormatting {
    public static void main(String[] args) {
        // Integer formatting
        int integer = 42;
        System.out.printf("Integer: %d%n", integer);
        System.out.println("Integer: " + integer);

        // Floating-point formatting
        double floatingPoint = 123.456789;
        System.out.printf("Floating-point (2 decimal places): %.2f%n", floatingPoint);
        System.out.println(floatingPoint);

        // String formatting
        String text = "Hello, world!";
        System.out.printf("String: %s%n", text);

        // Character formatting
        char character = 'A';
        System.out.printf("Character: %c%n", character);

        // Boolean formatting
        boolean bool = true;
        System.out.printf("Boolean: %b%n", bool);

        // Hexadecimal formatting
        int hex = 255;
        System.out.printf("Hexadecimal: %x%n", hex);
    }
}
