class Bird {
    void fly() {
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Bird {
    void fly() {
        System.out.println("Sparrow flies fast");
    }
}

public class Over2 {
    public static void main(String[] args) {
        Sparrow s1 = new Sparrow();
        s1.fly();
    }
}
