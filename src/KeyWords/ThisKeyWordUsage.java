package KeyWords;

public class ThisKeyWordUsage {
    int a =10;
    int b =20;

    ThisKeyWordUsage(int x, int y){
       this.a=x;
       this.b=y;
    }
    public void print(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[]args){
        ThisKeyWordUsage th=new ThisKeyWordUsage(5,6);
        th.print();
    }
}
