package Problem1;

import java.util.ArrayList;

public class Order {
    // variables
    ArrayList<MenuItem> itemList = new ArrayList<>();

    // methods
    public void addItem(MenuItem item) {
        itemList.add(item);
    }

    public void calculateTotal() {
        double total = 0;
        for(int i = 0; i < itemList.size(); i++) {
            total += itemList.get(i).getPrice();
        }
        System.out.printf("\nTotal: $%.2f\n", total);
    }

    public void displayOrderDetails() {
        System.out.print("\nProblem1.Order Details:");
        for(int i = 0; i < itemList.size(); i++) {
            itemList.get(i).displayItemInfo();
        }
        calculateTotal();
    }
}
