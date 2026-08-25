package Problem1;

public class Problem1_Main {
    public static void main(String[] args) {
        MenuItem cannoli = new MenuItem("Cannoli", 2.00, "Dessert");
        MenuItem latte = new MenuItem("Latte", 3.00, "Beverage");
        MenuItem sandwich = new MenuItem("Sandwich", 4.50, "Entree");

        Cafe cafe = new Cafe();
        cafe.addMenuItem(sandwich);
        cafe.addMenuItem(latte);
        cafe.addMenuItem(cannoli);

        Order order = new Order();
        order.addItem(sandwich);
        order.addItem(latte);
        order.addItem(cannoli);

        cafe.displayMenu();
        cafe.placeOrder(order);
    }
}
