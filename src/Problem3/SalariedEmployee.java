package Problem3;

public class SalariedEmployee extends Employee implements Payable {
    // variables
    private double salary;

    // constructor I
    public SalariedEmployee(String name, String id, double s) {
        super(name, id);
        salary = s;
    }
    // getters II
    public double getSalary() {
        return salary;
    }

    // methods
    @Override
    public double calculatePay() {
        return (salary * 12);
    }

    @Override
    public String getPayDetails() {
        return String.format("\n%s is paid $%.2f monthly. ($%.2f / 12)", super.getName(), salary, calculatePay());
    }
}
