package OOPSconcepts;
//Method Overloading: need to change the definition (give different parameters)
//Method Overriding: need to change the implementation.

public class MethodOverLoadingAndOverRiding {
    public static void main(String[]args){
        XYZ obj2 = new XYZ();
        obj2.Method1(30);
        obj2.Method2(50);
        obj2.Method2(2,3);

    }
}
class ABC{
    void Method1(int a){
        System.out.println(a);
    }
    void Method2(int b){
        System.out.println(b);
    }
}
class XYZ extends ABC{
    void Method1(int a){
        System.out.println(a*a); //Method Overriding
    }
    void Method2(int d, int e){
        System.out.println(d+e); //Method Overloading
    }
}

