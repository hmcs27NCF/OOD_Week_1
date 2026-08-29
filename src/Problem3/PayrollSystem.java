package Problem3;
import java.util.ArrayList;

public class PayrollSystem {
    // variables
    private ArrayList<Payable> payroll;

    // constructor I
    public PayrollSystem() {
        payroll = new ArrayList<>();
    }

    // methods
    public void addToPayroll(Payable p) {
        payroll.add(p);
    }

    public void processPayroll() {
        double totalPay = 0;
        for(int i = 0; i < payroll.size(); i++) {
            System.out.println(payroll.get(i).getPayDetails());
            totalPay += payroll.get(i).calculatePay();
        }
        System.out.printf("\nTotal payroll cost: $%.2f\n", totalPay);
    }
}
