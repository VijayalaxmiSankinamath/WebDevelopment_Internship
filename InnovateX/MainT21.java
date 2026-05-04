class Car {
    String modelName;
    String color;
    double cost;

    Car(String modelName, String color, double cost) {
        this.modelName = modelName;
        this.color = color;
        this.cost = cost;
    }

    public String toString() {
        return this.modelName + " " + this.color + " " + this.cost;
    }
}

public class MainT21 {
    public static void main(String[] args) {

        Car c1 = new Car("Hyundai Creta", "White", 1200000);

        System.out.println(c1);
    }
}
