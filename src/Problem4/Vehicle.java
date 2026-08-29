package Problem4;

public abstract class Vehicle implements Rentable {
    // variables
    private String make;
    private String model;
    private String year;
    private double dailyRate;

    // constructor I
    public Vehicle(String ma, String mo, String y, double d) {
        make = ma;
        model = mo;
        year = y;
        dailyRate = d;
    }
    // getters II
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getYear() {
        return year;
    }
    public double getDailyRate() {
        return dailyRate;
    }

    // methods : concrete
    public void displayVehicleInfo() {
        System.out.printf("%s %s %s - $%.2f/day\n", year, make, model, dailyRate);
    }
}
