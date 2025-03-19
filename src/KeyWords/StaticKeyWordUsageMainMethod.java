package KeyWords;

//Need to use "Class Name" if we want access Static variable and methods
public class StaticKeyWordUsageMainMethod {
    public static void main(String[] args) {
        StaticKeyWordUsage st = new StaticKeyWordUsage();
        st.display1();
        StaticKeyWordUsage.c=50;//Static variable can access directly (without create object)
        StaticKeyWordUsage.display2(); //Static method can access directly (without create object)
        st.display3();



    }
}
