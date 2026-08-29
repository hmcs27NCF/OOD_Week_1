package Problem4;

public class Car extends Vehicle implements Rentable {
    // constructor I
    public Car(String ma, String mo, String y, double d) {
        super(ma, mo, y, d);
    }

    // methods
    @Override
    public double calculateRentalCost(int days) {
        return super.getDailyRate() * days;
    }

    @Override
    public String getRentalTerms() {
        return "Standard rental includes 200 free miles per day; extra miles cost $2.00 per mile.\n";
    }
}
