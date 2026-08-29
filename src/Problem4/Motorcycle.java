package Problem4;

public class Motorcycle extends Vehicle implements Rentable {
    // variables
    public static double insurance;

    // constructor I
    public Motorcycle(String ma, String mo, String y, double d) {
        super(ma, mo, y, d);
        insurance = 25.0;
    }

    // methods
    @Override
    public double calculateRentalCost(int days) {
        return super.getDailyRate() * days + insurance;
    }

    @Override
    public String getRentalTerms() {
        return String.format("Motorcycle rental requires a mandatory $%.2f insurance fee and a valid motorcycle license.\n", insurance);
    }
}
