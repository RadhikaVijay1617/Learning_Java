package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicArrayInput {
    public static void main(String[]args){
DynamicArray1();

    }
    public static void DynamicArray1(){

        int a[] = new int[5];
        Scanner Scan= new Scanner(System.in);
        for (int i=0; i<a.length; i++)
        {
            System.out.println("Enter value in position:"+i+":");
            a[i] = Scan.nextInt();
        }

        System.out.println(Arrays.toString(a));
    }
}
