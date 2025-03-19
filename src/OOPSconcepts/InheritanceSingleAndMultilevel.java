package OOPSconcepts;
//Acquiring all the properties(Variable) and behaviour(methods) from one class to another class is called Inheritance.
public class InheritanceSingleAndMultilevel {
    public static void main(String[] args) {
        c obj1 = new c();
        obj1.a = 100;
        obj1.b = 200;
        obj1.c = 300;
        obj1.Method1();
        obj1.Method2();
        obj1.Method3();
    }
}

class A {
    int a;

    void Method1() {
        System.out.println(a);
    }
}

class B extends A {
    int b;

    void Method2() {
        System.out.println(b);
    }
}

class c extends B {
    int c;

    void Method3() {
        System.out.println(c);
    }
}





