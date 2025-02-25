package Arrays;
//if we indicate "Object" initiation, we can store all kinds of datatypes
public class ArrayOfObjects {
    public static void main(String[]args){
        Object a[]={1,2,"Welcome",4.234,'R',true};

        for(Object i:a){
            System.out.println(i);
        }
    }
}
