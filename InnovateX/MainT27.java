class TV {
    double cost;
    String brand;
    String type;

    TV(double cost, String brand, String type) {
        this.cost = cost;
        this.brand = brand;
        this.type = type;
    }

    public String toString() {
        return this.cost + " " + this.brand + " " + this.type;
    }
}

public class MainT27 {
    public static void main(String[] args) {

        TV t1 = new TV(55000, "Sony", "LED");

        System.out.println(t1);
    }
}

