class Dress {
    String color;
    String size;
    double cost;

    Dress(String color, String size, double cost) {
        this.color = color;
        this.size = size;
        this.cost = cost;
    }

    public boolean equals(Object obj) {
        Dress d = (Dress) obj;
        return this.color.equals(d.color);
    }
}

public class MainE6 {
    public static void main(String[] args) {
        Dress d1 = new Dress("Red", "M", 1500);
        Dress d2 = new Dress("Red", "L", 2000);

        System.out.println(d1.equals(d2)); 
    }
}