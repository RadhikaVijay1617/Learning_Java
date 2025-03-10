package OOPSconcepts;

public class MethodOverLoadingMainMethod {
    public static void main(String[]args){
        MethodOverLoading adding = new MethodOverLoading();
        adding.sum();
        adding.sum(1,2,3);
        adding.sum(2,3,2.2);
        adding.sum(8,8);

    }
}
