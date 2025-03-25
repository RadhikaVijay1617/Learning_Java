package ExceptionHandling;
//The exceptions which are identified by Java compiler is called checked exception
public class CheckedException {
    public static void main(String[]args) throws InterruptedException {
        System.out.println("Program started....");
        System.out.println("Program in process....");
        Thread.sleep(5000);

        System.out.println("Program finished....");
        System.out.println("program exited...");
    }
}
