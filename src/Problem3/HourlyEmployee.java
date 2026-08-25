package Problem3;

public class HourlyEmployee extends Employee implements Payable {
    // variables
    private double rate;
    private double hours;

    // constructor I
    public HourlyEmployee(String name, String id, double r, double h) {
        super(name, id);
        rate = r;
        hours = h;
    }
    // getters II
    public double getRate() {
        return rate;
    }
    public double getHours() {
        return hours;
    }

    // methods
    @Override
    public double calculatePay() {
        return (hours / rate);
    }

    @Override
    public String getPayDetails() {
        return String.format("\n%s is paid $%.2f. (%.2f at $%.2f an hour)", super.getName(), calculatePay(), hours, rate);
    }
}
