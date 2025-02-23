package ControlStructures;

public class ForLoop {
    public static void main(String[]args){
//ForLoop1();
//ForLoop2();
//ForLoop3();
//ForLoop4();
ForLoop5();
    }
    //Increment 1 to 10
    public static void ForLoop1(){
        for (int i=1; i<=10; i++){
            System.out.println(i);
        }
    }
    //Decrement 10 to 1
    public static void ForLoop2(){
        for (int i=10; i>=0; i--){
            System.out.println(i);
        }
    }
    //1 to 10 even numbers
    public static void ForLoop3(){
        for(int i=2; i<=10; i+=2){

            System.out.println(i);
        }
    }
    //1 to 10 odd numbers
    public static void ForLoop4(){
        for(int i=1; i<=10; i+=2){

            System.out.println(i);
        }
    }
    //Write word even and odd from 1 to 10 numbers
    public static void ForLoop5(){
        for(int i=1; i<=10; i++){
            if(i%2==0){
                System.out.println(i +" "+"Even");
            }
            else {
                System.out.println(i +" "+"Odd");
            }
        }
    }
}
