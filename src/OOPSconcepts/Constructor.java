package OOPSconcepts;

public class Constructor {
    int x,y,z;short J ;

    Constructor(){  //default constructor
        x=10;
        y=20;
        z=30;
    }
    Constructor(int a, int b, int c){ //parameterized constructor
        x=a;
        y=b;
        z=c;
    }
    void Sum(){
        System.out.println(x+y+z);
    }

}
