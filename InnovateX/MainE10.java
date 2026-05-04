class Car {
    String name;
    String type;
    double cost;

    Car(String name, String type, double cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }

    public boolean equals(Object obj) {
        Car c = (Car) obj;
        return this.name.equals(c.name);
    }
}

public class MainE10 {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "SUV", 5000000);
        Car c2 = new Car("BMW", "SUV", 6000000);

        System.out.println(c1.equals(c2)); // true
    }
}