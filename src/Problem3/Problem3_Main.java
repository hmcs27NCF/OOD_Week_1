package Problem3;

public class Problem3_Main {
    public static void main(String[] args) {
        System.out.print("\n- - - - - - - - - - -");

        SalariedEmployee e1 = new SalariedEmployee("Tanta Goybee", "2915", 90000.00);
        System.out.println(e1.getPayDetails());

        HourlyEmployee e2 = new HourlyEmployee("Emerson Scraggadilly", "3459", 25.0, 50.0);
        System.out.println(e2.getPayDetails());

        ContractEmployee e3 = new ContractEmployee("Tyrigorous \"Tynamo\" Dillquan", "2567", 3000.0);
        System.out.println(e3.getPayDetails());

        System.out.println("- - - - - - - - - - -");
    }
}
