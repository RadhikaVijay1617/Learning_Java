package Basics;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        //StringLength();
        //StringConcat();
        //StringTrim();
        //CharAt();
        //ContainsMethod();
        // EqualsMethod();
        //ReplaceMethod1();
        //ReplaceMethod2();
        //SubStringMethod();
        //UpperLowerCaseMethod();
        //SplitMethod1();
        Exercise1();
    }

    public static void StringLength() {
        String name = "Radhika";
        System.out.println(name.length()); //will give number of characters
        System.out.println("Radhika".length()); //will give number of characters
    }

    public static void StringConcat() {
        String firstname = "Radhika";
        String middlename = "SS";
        String lastname = "Vijay";
        System.out.println(firstname + " " + lastname);
        System.out.println(firstname.concat(lastname));
        System.out.println(firstname.concat(middlename).concat(lastname));
        System.out.println(firstname.concat(middlename + lastname));
    }

    //Remove space from right and left side
    public static void StringTrim() {
        String firstname = "   Radhika   ";
        //String lastname="    Vijay    ";
        System.out.println(firstname.length());
        System.out.println(firstname);
        System.out.println(firstname.trim().length());
    }

    //Return character from a string based on index
    public static void CharAt() {
        String firstname = "Radhika";
        String lastname = "Vijay";
        System.out.println(firstname.charAt(3));
        int num = 232;
    }

    //Contains() method should always have boolean value - returns true/false
    public static void ContainsMethod() {
        String fullname = "Radhika Vijay";
        System.out.println(fullname.contains("Radh"));
        System.out.println(fullname.contains("Vijay"));
        System.out.println(fullname.contains("radhika"));//false because case-sensitive
        System.out.println(fullname.contains("hda"));
    }

    //equals(), equalsIgnoreCase() - Compare strings - return value should be boolean - true/false
    public static void EqualsMethod() {
        String s1 = "Welcome";
        String s2 = "Welcome";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Welcome"));
        System.out.println(s1.equals("welcome")); //false - case sensitive
        System.out.println(s1.equalsIgnoreCase("welcome")); //ture
    }

    //replace() - replace single/multiple(sequence) of characters in a string
    public static void ReplaceMethod1() {
        String s1 = "Welcome to selenium java selenium python selenium";
        System.out.println(s1.replace('e', 'x'));
        System.out.println(s1.replace("selenium", "playwright"));
    }
    public static void ReplaceMethod2() {
        String s1 = "$55,43,22";
        System.out.println(s1.replace("$"," "));
        System.out.println(s1.replace("$","").replace(",",""));
    }

    //SubString() - extract substring from the main string
    public static void SubStringMethod() {
        String s1 = "Welcome";
        System.out.println(s1.substring(3, 7));
        System.out.println(s1.substring(0, 2));
    }

    //toUpperCase() toLowerCase()
    public static void UpperLowerCaseMethod() {
        String s1 = "weLcome";
        String s2 = "WElCOME";
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
    }

    //Split() - split the string into multiple parts based on delimiter
    public static void SplitMethod1() {
        String s1 = "vradhu,2006@gmail.com";
        String c = "abc 123";

        String a[] = s1.split(","); //split method will return in array
        System.out.println(Arrays.toString(a));
        String b[] = s1.split("@");
        System.out.println(Arrays.toString(b));
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(b[0]);
        System.out.println(b[1]);

        String s2[] = c.split(" ");
        System.out.println(Arrays.toString(s2));
        //* % ^ & (  ) - we can not use a delimiters
    }
        //Exercise - combine multiple methods
    public static void Exercise1(){
        String name = "Radhika Vijay";
        System.out.println(name.contains("vijay"));//it's a false because "v" is a lower case but need make ture
        //Two ways to make it true
        System.out.println(name. replace("V","v").contains("vijay"));
        System.out.println(name.toLowerCase().contains("vijay"));
    }
}
