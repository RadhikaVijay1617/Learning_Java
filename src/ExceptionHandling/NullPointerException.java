package ExceptionHandling;
//if we applied the variable without having value, system throw null pointer exception
public class NullPointerException {
    public static void main(String[]args){
        //String s= "Welcome";
       String s=null;
      System.out.println(s.length()); //here "null" is an unknown value so system throw "NullPointerException"

//        int a = null;
//        System.out.println(a);
    }
}
