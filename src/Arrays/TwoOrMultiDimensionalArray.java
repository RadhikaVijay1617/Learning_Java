package Arrays;

public class TwoOrMultiDimensionalArray {
    public static void main(String[]args){
//MultiDimensionalArray1();
//MultiDimensionalArray2();
        //TwoDimensionalForLoop1();
        TwoDimensionalForLoop2();
    }
    public static void MultiDimensionalArray1(){
      int a[][]= new int[3][2];
      a[0][0] = 100;
      a[0][1] = 200;
      a[1][0] = 400;
      a[1][1] = 500;
      a[2][0] = 600;
      a[2][1] = 700;
        System.out.println(a[0][1]);
    }
    public static void MultiDimensionalArray2(){
        int a[][]={ {100,200},{300,400},{500,600}  };
        System.out.println(a.length); //helps to find number of rows in the array
        System.out.println(a[0].length);// helps to find number of column in the array
        System.out.println(a[0][1]);// helps to find particular value in the array
    }
    //Two-dimensional For Loop
    public static void TwoDimensionalForLoop1(){
        int a[][]={ {100,200},{300,400},{500,600}  };

        for(int r=0; r<=2; r++) { // or we can use like this r<=a.length-1
            for (int c = 0; c <= 1; c++) { //or we can use like this c<=a[r].length-1
                System.out.print(a[r][c] +"  ");
            }
            System.out.println();
        }
    }
    //Enhanced two-dimensional For Loop
    public static void TwoDimensionalForLoop2(){
        int a[][]={ {100,200},{300,400},{500,600}  };
        for(int x[]:a) {
        for(int y:x){
            System.out.println(y);
        }
        }

    }
}
