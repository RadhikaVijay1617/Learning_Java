package OOPSconcepts;

interface Shape{
    void Square(); //This abstract method so don't need to implementation
    //All methods are in "public" by default

    default void Rectangel(){ //default method
        System.out.println("This is for Rectangle");
    }
    static void Circle(){ //static method
        System.out.println("This is for Circle");
    }

}

public class InterfaceDemo implements Shape { //we have to use "implements" key word to inherit from interface to class
    int a=100,b=200;
    public void Square(){ //we have to use "public" access modifier here
        System.out.println("This is for Square");
    }
    public void Triangle(){
        System.out.println("This is for Triangle");
    }
    public static void main(String[]args){
        //Scenario - 1
        InterfaceDemo obj1 = new InterfaceDemo(); //Object is created for class and stored in the class variable
        obj1.Square();
        obj1.Rectangel();
        Shape.Circle(); //Static method can directly access from interface.
        obj1.Triangle(); //default method created in class
        System.out.println(obj1.a+obj1.b);


        //Scenario - 2
        Shape obj2 = new InterfaceDemo(); //Object is created for class and stored in the interface variable
        obj2.Square();
        obj2.Rectangel();
        Shape.Circle();

    }
}
