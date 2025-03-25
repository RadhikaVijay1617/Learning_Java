package Basics;

class ObjectCasting1{
    String name="Welcome";
    void M1(){
        System.out.println(name);
    }
}
class ObjectCasting2 extends ObjectCasting1{
    int id=12345;
    void M2(){
        System.out.println(id);
    }
}

public class TypeCastingObject1 {
    public static void main(String[]args){
//        ObjectCasting2 obj1 = new ObjectCasting2();
//        obj1.name = "hello";
//        obj1.M1();
//        obj1.id=776677;
//        obj1.M2();

//        ObjectCasting1 obj=new ObjectCasting2();
//        obj.M1();

        ObjectCasting2 obj= (ObjectCasting2) new ObjectCasting1();




    }
}
