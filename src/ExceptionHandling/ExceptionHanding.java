package ExceptionHandling;

public class ExceptionHanding {
    public static void main(String[]args){
        String s = null;
        //System.out.println(s.length()); //NullPointerException will occur

        //Use Try, Catch and finally block to handing exception
        //Finally block always executed if catch block handled or not handled

        try
        {
            System.out.println(s.length());
        }
        catch (Exception e)
        {
            System.out.println("Catch Block to handle exception");
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Finally block executed");
        }

    }
}
