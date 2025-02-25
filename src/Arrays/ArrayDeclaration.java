package Arrays;
//Arrays - Array is collection of elements of same data type(Homogenios data)
//We can store multiple value in one variable
//Type of Arrays - Single dimensional and two/multidimensional

//1.Declare an array
//2. Add values into array
//3.Find size of an array
//4.Read single value from an array
//5.Read multiple values from an array


public class ArrayDeclaration {
    public static void main(String[] args) {
        //ArrayApproach1();
        //ArrayApproach2();
        ArrayDeclaration1();
        ArrayDeclaration2();
    }

    public static void ArrayApproach1() {
        //Approach - 1
        int a[] = new int[5];
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        a[4] = 500;
    }

    public static void ArrayApproach2() {
        int a[] = {100, 200, 300, 400, 500};
        System.out.println(a.length); //Find how may values in array
        System.out.println(a[3]); //Find value in the particular index
    }

    public static void ArrayDeclaration1(){

        int a[] = {100, 200, 300, 400, 500};

        for (int i = 0; i < 5; i++) { // i<=4 or i<5 or i<=a.length-1 or i<a.length
            System.out.println(a[i]);

        }
    }

    //Print the all values in the array// Enhance for loop/ for..each loop
    public static void ArrayDeclaration2() {
        int a[] = {1, 2, 3, 4, 5, 6};
        for (int i : a) {
            System.out.println(i);
        }
    }
}

