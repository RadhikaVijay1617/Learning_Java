package Arrays;

public class FindMaxAndMinValueInArray {
    public static void main(String[]args){
        MaxInArray();
        MinInArray();
    }
        //Find max number in array
    public static void MaxInArray(){
        int a[]={20,40,60,30,90,50};
        int max=a[0];

        for (int i=1; i<a.length; i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum number in the array is:"+max);
    }
    public static void MinInArray(){
        int a[]={20,40,60,30,90,50};
        int min=a[0];

        for (int i=1; i<a.length; i++){
            if (a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Minimum number in the array is:"+min);
    }



}
