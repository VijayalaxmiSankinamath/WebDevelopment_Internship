class Mobile {
    String name;
    double cost;
    String color;

    // Constructor
    Mobile(String name, double cost, String color) {
        this.name = name;
        this.cost = cost;
        this.color = color;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Mobile Name: " + name + 
               "\nCost: " + cost + 
               "\nColor: " + color;
    }
}

public class MainT {
    public static void main(String[] args) {
        
        // Initializing values using constructor
        Mobile m1 = new Mobile("Samsung Galaxy S23", 75000, "Black");
        
        // Printing object (calls toString() automatically)
        System.out.println(m1);
    }
}
