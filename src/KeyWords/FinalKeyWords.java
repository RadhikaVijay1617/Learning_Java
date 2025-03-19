package KeyWords;
//we can use the final key for variable, method and class
public class FinalKeyWords {
    final int a=10;
    public static void main(String[]args){
        Method1();
    }
    public static void Method1(){
        FinalKeyWords FKW=new FinalKeyWords();
        //FKW.a=20;  //If we use the final key work in variable, we can not assign new value to the variable.
        System.out.println(FKW.a);
    }
}


