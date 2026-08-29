package Problem3;

public class Problem3_Main {
    public static void main(String[] args) {
        System.out.print("\n- - - - - - - - - - -");

        SalariedEmployee e1 = new SalariedEmployee("Tanta Goybee", "2915", 2000.00);
        HourlyEmployee e2 = new HourlyEmployee("Emerson Scraggadilly", "3459", 25.0, 50.0);
        ContractEmployee e3 = new ContractEmployee("Tyrigorous \"Tynamo\" Dillquan", "2567", 3000.0);

        PayrollSystem p = new PayrollSystem();

        p.addToPayroll(e1);
        p.addToPayroll(e2);
        p.addToPayroll(e3);
        p.processPayroll();

        System.out.println("- - - - - - - - - - -");
    }
}
