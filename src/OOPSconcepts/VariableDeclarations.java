package OOPSconcepts;

//There 3 kind of variable declaration
//Type-1:
public class VariableDeclarations {
    int sid;
    String sname;
    char grad;

    void Print1StudentData() {
        System.out.println(sid + " " + sname + " " + grad);
    }

    //Type-2: create a method for store local variable and assign local variable to class vaiable
    void StudentData(int stuid, String stuname, char stugrad) {
        sid = stuid;
        sname = stuname;
        grad = stugrad;

    }
    //Type-3: Constructor way
    //Constructor never return value
    VariableDeclarations(int stuid, String stuname, char stugrad){
        sid = stuid;
        sname = stuname;
        grad = stugrad;
    }

}






