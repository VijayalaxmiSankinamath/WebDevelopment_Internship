class TV {
    String brand;
    String type;
    double cost;

    TV(String brand, String type, double cost) {
        this.brand = brand;
        this.type = type;
        this.cost = cost;
    }

    public boolean equals(Object obj) {
        TV t = (TV) obj;
        return this.brand.equals(t.brand);
    }
}

public class MainE8 {
    public static void main(String[] args) {
        TV t1 = new TV("Sony", "LED", 45000);
        TV t2 = new TV("Sony", "OLED", 55000);

        System.out.println(t1.equals(t2)); // true
    }
}