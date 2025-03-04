package Arrays;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[]args) {
//SoringArrayForInt();
//SoringArrayForChar();
//SoringArrayForString();

    }

    //Array sorting for integer
    public static void SoringArrayForInt(){
        int a[]= {20,30,90,10,40,30,60};

        System.out.println("Before Sorting.....");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After Sorting......");
        System.out.println(Arrays.toString(a));

    }
    //Array sorting for char
    public static void SoringArrayForChar(){
        char s[]= {'b','e','r','o','a'};

        System.out.println("Before Sorting.....");
        System.out.println(Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("After Sorting......");
        System.out.println(Arrays.toString(s));

    }
    //Array sorting for string
    public static void SoringArrayForString(){
        String s[]= {"cat", "mat", "nuts", "apple"};

        System.out.println("Before Sorting.....");
        System.out.println(Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("After Sorting......");
        System.out.println(Arrays.toString(s));

    }
}
