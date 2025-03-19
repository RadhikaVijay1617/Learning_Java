package OOPSconcepts;
//Acquiring all the properties(Variable) and behaviour(methods) from one class to another class is called Inheritance.
public class InheritanceHierarchy {
    public static void main(String[]args){
        Child1 obj1=new Child1();
        obj1.Print1();
        obj1.Print2();

        Child2 obj2=new Child2();
        obj2.Print1();
        obj2.Print3();
    }
}
class Parent{
    int a=100;
    void Print1(){
        System.out.println(a);
    }
}
class Child1 extends Parent{
    int b=200;
    void Print2(){
        System.out.println(b);
    }
}
class Child2 extends Parent{
    int c=300;
    void Print3(){
        System.out.println(c);
    }
}

