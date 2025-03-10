package OOPSconcepts;

//One thing can have multiple forms(EX:Shape-circle, square,rectangle etc.)
//We can achieve polymorphism using Overloading.
// rules for Overloading method:
//1. Method name should be same
//2. Number, Data and Order of parameters should be different
public class MethodOverLoading {
    int x=10, y=20, z=30;

    void sum() {
        System.out.println(x + y + z); //without parameter
    }

    void sum(int x, int y, int z) {
        //with parameter(passing 3 parameters)
        System.out.println(x + y + z);
    }

    void sum(int x, int y, double z) {
        //with parameter(passing 3 parameters with different data type)
        System.out.println(x + y + z);
    }

    void sum(int x, int y) {
        //with parameter(passing 2 parameters)
        System.out.println(x + y);
    }


}

