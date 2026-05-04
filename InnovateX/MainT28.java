class Bike {
    String color;
    double cost;
    String brand;

    Bike(String color, double cost, String brand) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
    }

    public String toString() {
        return this.color + " " + this.cost + " " + this.brand;
    }
}

public class MainT28 {
    public static void main(String[] args) {

        Bike b1 = new Bike("Red", 95000, "Yamaha");

        System.out.println(b1);
    }
}