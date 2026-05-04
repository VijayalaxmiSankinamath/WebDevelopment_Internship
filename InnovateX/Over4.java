class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

public class Over4 {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.draw();
    }
}
