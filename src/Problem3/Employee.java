package Problem3;

public abstract class Employee {
    // variables
    private String name;
    private String id;

    // constructor I
    public Employee(String n, String i) {
        name = n;
        id = i;
    }
    // getters II
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }

    // methods
    public void displayInfo() {
        System.out.println(name);
        System.out.println(id);
    }
}
