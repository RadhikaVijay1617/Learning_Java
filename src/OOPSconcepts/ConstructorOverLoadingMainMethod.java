package OOPSconcepts;

public class ConstructorOverLoadingMainMethod {
    public static void main(String[]args){
        ConstructorOverLoading ConOver1=new ConstructorOverLoading();
        System.out.println(ConOver1.CalculateBox());

        ConstructorOverLoading ConOver2=new ConstructorOverLoading(2.2,3.2,4.2);
        System.out.println(ConOver2.CalculateBox());

        ConstructorOverLoading ConOver3=new ConstructorOverLoading(5.5);
        ConOver3.CalculateBox2();
    }
}
