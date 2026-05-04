class Laptop {
    String name;
    String brand;
    double cost;

    Laptop(String name, String brand, double cost) {
        this.name = name;
        this.brand = brand;
        this.cost = cost;
    }

    public boolean equals(Object obj) {
        Laptop l = (Laptop) obj;
        return this.name.equals(l.name);
    }
}

public class MainE9 {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("XPS", "Dell", 80000);
        Laptop l2 = new Laptop("XPS", "HP", 75000);

        System.out.println(l1.equals(l2)); // true
    }
}