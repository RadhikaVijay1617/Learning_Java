package OOPSconcepts;

public class EncapsulationMainMethod {

    public static void main(String[]arg){
        Encapsulation Enc = new Encapsulation();
        Enc.setAccnonum(34324);
        Enc.setName("Radhu");
        Enc.setAmount(3432432.23);

        System.out.println(Enc.getAccnonum());
        System.out.println(Enc.getName());
        System.out.println(Enc.getAmount());

    }

}
