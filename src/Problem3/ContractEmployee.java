package Problem3;

public class ContractEmployee extends Employee implements Payable {
    // variables
    private double fee;

    // constructor I
    public ContractEmployee(String name, String id, double f) {
        super(name, id);
        fee = f;
    }
    // getters II
    public double getFee() {
        return fee;
    }

    // methods
    @Override
    public double calculatePay() {
        return getFee();
    }

    @Override
    public String getPayDetails() {
        return String.format("\n%s is paid a flat contract fee of $%.2f.", super.getName(), calculatePay());
    }
}
