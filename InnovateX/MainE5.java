class Home {
    String name;
    String color;
    double cost;

    Home(String name, String color, double cost) {
        this.name = name;
        this.color = color;
        this.cost = cost;
    }

    public boolean equals(Object obj) {
        Home h = (Home) obj;
        return this.name.equals(h.name);
    }
}

public class MainE5 {
    public static void main(String[] args) {
        Home h1 = new Home("DreamVilla", "White", 5000000);
        Home h2 = new Home("DreamVilla", "Blue", 5500000);

        System.out.println(h1.equals(h2)); 
    }
}