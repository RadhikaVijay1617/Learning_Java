package OOPSconcepts;
//We can overload the main method as per normal method
public class MainMethodOverLoading {
    public static void main(String[]args){

        //need to create object to access the main method in default main method
        MainMethodOverLoading ma = new MainMethodOverLoading();
        ma.main(2323);
        ma.main("Radhika");
        ma.main("Hello", "Radhu");
        ma.main(3243.4343);


    }
    void main(int id){
        System.out.println(id);
    }
    void main(String name){
        System.out.println(name);
    }
    void main(String s1, String s2){
        System.out.println(s1+s2);
    }
    void main(double num){
        System.out.println(num);
    }
}
