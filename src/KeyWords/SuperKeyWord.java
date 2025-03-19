package KeyWords;
//Super keyword will be used to invoke the immediate parent class variable
//Super keyword will be used to invoke the immediate parent class method
public class SuperKeyWord {
    public static void main(String[]args){
        XYZ xyz=new XYZ();
        xyz.M1();

    }
}

class ABC{
     int a = 10;
     void M1(){
        System.out.println(a);
    }
}
class XYZ extends ABC{
    int a =20;
    void M1(){
        System.out.println(super.a); //Use "super" keyword, it will invoke parent value
        super.M1();
    }
}