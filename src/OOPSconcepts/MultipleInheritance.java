package OOPSconcepts;
//Multiple inheritance ( add multiple parent(Interface) with one child(class))
public class MultipleInheritance implements Interface1,Interface2{

    public void add1(){
        System.out.println(a+b);
    }
    public void add2(){
        System.out.println(c+d);
    }

    public static void main(String[]args){
        MultipleInheritance muobj=new MultipleInheritance();
        muobj.add1();
        muobj.add2();
    }

    //If we want to inherit with Class alone with Interface, need to follow below keywords
    //public class MultipleInheritance extends Classname implements Interface1,Interface2 _- Hybrid Inheritance(Multiple and hierarchy)

}
