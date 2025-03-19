package KeyWords;

//Static keyword can be applied for variables and methods.
//We are able to use the static variable and static method without creating object in main method

public class StaticKeyWordUsage {
    int a=10;
    int b=20;
    static int c=5;
    public static void main(String[] args) {
        StaticKeyWordUsage st = new StaticKeyWordUsage();
        st.display1();
        c=50;//Static variable can access directly (without create object)
        display2(); //Static method can access directly (without create object)
        st.display3();


    }
    public void display1(){ //Non-static method
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);}

    public static void display2(){ //Static method
        StaticKeyWordUsage st1= new StaticKeyWordUsage();
        st1.a=3;
        st1.b=2;
        st1.c=7; //we are able to change the static value if we want
        System.out.println(st1.a);
        System.out.println(st1.b);
        System.out.println(c);}

    public void display3(){ //Non-static method directly access all variables and methods(without main method)
        display1();
        display2();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
    }




