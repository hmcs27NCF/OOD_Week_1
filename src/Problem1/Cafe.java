package Problem1;

import java.util.ArrayList;

public class Cafe {
    // variables
    ArrayList<MenuItem> itemList = new ArrayList<>();

    // methods
    public void addMenuItem(MenuItem item) {
        itemList.add(item);
    }

    public void placeOrder(Order order) {
        order.displayOrderDetails();
    }

    public void displayMenu() {
        System.out.print("\nProblem1.Cafe Menu:");
        for(int i = 0; i < itemList.size(); i++) {
            itemList.get(i).displayItemInfo();
        }
    }
}
