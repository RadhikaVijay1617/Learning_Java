package Basics;

public class VariableScope {
    int GlobalVar1 = 10;
    int GlobalVar2 = 20;

    public static void main(String []args){
        VariableScope VarSco = new VariableScope();
        VarSco.Addition();
        VarSco.Subtraction();
    }
    public void Addition(){
        int LocalVar = 30;
        System.out.println("Addition:" + (GlobalVar1+LocalVar));

    }
    public void Subtraction(){
        System.out.println("Subtraction:" + (GlobalVar2/GlobalVar1));

    }
}
