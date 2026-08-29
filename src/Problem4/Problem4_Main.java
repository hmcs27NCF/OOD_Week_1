package Problem4;

public class Problem4_Main {
    public static void main(String[] args) {
        Customer c = new Customer("Kieran");
        RentalCompany r = new RentalCompany();

        Car car = new Car("Toyota", "Camry", "2023", 45.0);
        Truck truck = new Truck("Hyundini", "Squash", "2027", 99.0);
        Motorcycle motorcycle = new Motorcycle("Grater", "Pavement-Pancake", "2028", 320.0);

        c.rentVehicle(car);
        c.rentVehicle(truck);
        c.rentVehicle(motorcycle);

        r.addVehicleToFleet(car);
        r.addVehicleToFleet(truck);
        r.addVehicleToFleet(motorcycle);

        System.out.println("");
        r.displayFleet();
        System.out.println("");
        r.displayAllRentalTerms();
        System.out.println("");
        c.getTotalSpent(3);
    }
}
