package Basics;

public class WrapperClasses {
    public static void main(String[]args){
        //String --> int, double, boolean
        //String to Char --> NOT Possible
        String a= "12";
        String b= "10";
        System.out.println(a+b);//Just concatenate the value not able to add those values
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        System.out.println(a1+b1);
        System.out.println(Integer.parseInt(a)+ Integer.parseInt(b));

        String x="12.3";
        String y="15.3";
        System.out.println(Double.parseDouble(x)+Double.parseDouble(y));

        String boo1 = "true";
        String boo2 = "false";
        String boo3 = "Welcome"; //If we enter other than "ture", it will show false
        System.out.println(Boolean.parseBoolean(boo1));
        System.out.println(Boolean.parseBoolean(boo2));
        System.out.println(Boolean.parseBoolean(boo3));


        // Int,Double,Boolean, chat --> String

        int ex1=10;
        double ex2=10.5;
        boolean ex3=true;
        char ex4 ='s';
        String ex11 = String.valueOf(ex1);
        String ex12 = String.valueOf(ex2);
        String ex13 = String.valueOf(ex3);
        String ex14 = String.valueOf(ex4);
        System.out.println(ex11);
        System.out.println(ex12);
        System.out.println(ex13);
        System.out.println(ex14);

    }




}
