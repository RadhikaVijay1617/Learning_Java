package OOPSconcepts;
//

public class ClassCreation {

    int empid;
    String empname;
    String job;
    double sal;

    //Method 1 - No parameter No return value
    void method1() {
        System.out.println(empid);
        System.out.println(empname);
        System.out.println(job);
        System.out.println(sal);
    }

    //Method 2: No parameter Return value
    String method2() {
        return ("EmployeeName:" + empname);
    }
    //Method 3: Takes parameter No return value

    void method3(int empid, String empname, String job, double sal) {
        System.out.println("EmployeeID:" + empid);
        System.out.println("EmployeeName:" + empname);
        System.out.println("Job:" + job);
        System.out.println("salary:" + sal);
    }

    //Take parameters Return value
    String method4(String empname) {
        return ("EmployeeName:" + empname);
    }

    //how to use local variable through method
    void localvaribale(int id, String name, String jo) {
        int empid = id;
        String empname = name;
        String job = jo;
        System.out.println(empid + empname + job);
    }
    //Using constructor to store the data in variable


}
