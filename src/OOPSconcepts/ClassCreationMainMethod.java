package OOPSconcepts;

public class ClassCreationMainMethod {
    public static void main(String[] args) {
        ClassCreation classcrea1 = new ClassCreation();
        classcrea1.empid = 101; //using object reference variable
        classcrea1.empname = "Sakthika";
        classcrea1.job = "Analyst";
        classcrea1.sal = 80000;
        classcrea1.method1();// method1

        String meth = classcrea1.method2();
        System.out.println(meth);//method2

        classcrea1.method3(123, "Radhika", "Data", 1234.23);//method3

        String met = classcrea1.method4("RadhikaR");
        System.out.println(met);//method4

        //how to use local variable in main method
        classcrea1.localvaribale(125, "Rosy", "Data");


    }
}
