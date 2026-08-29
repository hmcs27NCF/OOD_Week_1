package Problem4;
import java.util.ArrayList;

public class RentalCompany {
    // variables
    ArrayList<Vehicle> fleet;

    // constructor I
    public RentalCompany() {
        fleet = new ArrayList<>();
    }

    // methods
    public void addVehicleToFleet(Vehicle v) {
        fleet.add(v);
    }

    public void displayFleet() {
        System.out.println("Current Fleet:");
        for(int i = 0; i < fleet.size(); i++) {
            fleet.get(i).displayVehicleInfo();
        }
    }

    public void displayAllRentalTerms() {
        System.out.println("Rental Terms:");
        for(int i = 0; i < fleet.size(); i++) {
            System.out.print(fleet.get(i).getRentalTerms());
        }
    }
}
