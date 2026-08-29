package Problem4;
import java.util.ArrayList;

public class Customer {
    // variables
    private String name;
    private ArrayList<Vehicle> rentalHistory;

    // constructor I
    public Customer(String n) {
        name = n;
        rentalHistory = new ArrayList<>();
    }
    // getters II
    public String getName() {
        return name;
    }

    // methods
    public void rentVehicle(Vehicle v) {
        rentalHistory.add(v);
    }

    public void getTotalSpent(int days) {
        double totalCost = 0;
        for(int i = 0; i < rentalHistory.size(); i++) {
            totalCost += rentalHistory.get(i).calculateRentalCost(days);
        }
        System.out.printf("%s's total for %d days: $%.2f\n", name, days, totalCost);
    }
}
