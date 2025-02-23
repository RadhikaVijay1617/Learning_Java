package ControlStructures;

//3 important steps : initialization, condition, increment/decrement
public class WhileLoop {
    public static void main(String[] args) {
        //Example1();
        //Example2();
        //Exmple3();
        //Exmple4();
        //Exmple5();
        WhileLoopWithCondition();
    }

    //Example 1: print 1 to 10 numbers
    public static void Example1() {
        int i = 1;
        while (i <= 10)
        {
            System.out.println(i);
            i++; //i=i+1
        }
    }
    //Print name 10 times
    public static void Example2(){
        int i = 1;
        while (i<=10){
            System.out.println("Radhika");
            i++;

        }
    }
    //Print even numbers between 1 and 10
    public static void Exmple3(){
        int i =2;
        while (i<=10){
            System.out.println(i);
            i+=2; //i= i+2
        }
    }
    //Print even numbers between 1 and 10
    public static void Exmple4(){
        int i =1;
        while (i<=10){
            System.out.println(i);
            i+=2; //i= i+2
        }
    }
    //Print 1 to 10 descending order
    public static void Exmple5(){
        int i =10;
        while (i>=0){
            System.out.println(i);
            i--;
        }
    }
    //While loop with condition
    public static void WhileLoopWithCondition() {
        int i = 1;
        while (true) {
            System.out.println("Hello");
            i++;
            if(i==10){
                break;
            }
        }
    }
}
