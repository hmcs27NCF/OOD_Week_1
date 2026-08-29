package Problem4;

public class Truck extends Vehicle implements Rentable {
    // variables
    public static double flatFee = 10.0;

    // constructor I
    public Truck(String ma, String mo, String y, double d) {
        super(ma, mo, y, d);
    }

    // methods
    @Override
    public double calculateRentalCost(int days) {
        return super.getDailyRate() * days + flatFee;
    }

    @Override
    public String getRentalTerms() {
        return String.format("Truck rental includes a flat $%.2f mileage fee. Late returns cost an extra $20.00/hour.\n", flatFee);
    }
}
