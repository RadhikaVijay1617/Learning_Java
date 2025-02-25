package Arrays;

public class SumOfArrayElements {
    public static void main(String[]args){
        int i[] = {1,2,3,4,5,6};
        int sum=0;
        for(int x:i){
            sum=sum+x;
        }
        System.out.println(sum);
    }
}
