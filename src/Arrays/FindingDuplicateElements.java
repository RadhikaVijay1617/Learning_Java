package Arrays;

public class FindingDuplicateElements {
    public static void main(String[]args){
        int a[] = {10,20,20,30,20,40,20,40,10,50,50,50};
        int element=20;
        int count=0;

        for(int value:a){
            if(value==element){
                count++;
            }
        }
        System.out.println(count);
    }
}
