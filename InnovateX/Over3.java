class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

public class Over3 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
