package Problem1;

public class MenuItem {
    // variables
    private String name;
    private double price;
    private String category;

    // constructor I
    public MenuItem(String n, double p, String c) {
        name = n;
        price = p;
        category = c;
    }
    // getters II
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
    // setters III
    public void setName(String s) {
        name = s;
    }
    public void setPrice(double d) {
        price = d;
    }
    public void setCategory(String s) {
        category = s;
    }

    // methods
    public void displayItemInfo() {
        System.out.printf("\n%s     $%.2f       (%s)", name, price, category);
    }
}
