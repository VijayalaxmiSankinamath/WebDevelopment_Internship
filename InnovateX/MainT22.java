class School {
    String name;
    String grade;
    int strength;

    School(String name, String grade, int strength) {
        this.name = name;
        this.grade = grade;
        this.strength = strength;
    }

    public String toString() {
        return this.name + " " + this.grade + " " + this.strength;
    }
}

public class MainT22 {
    public static void main(String[] args) {

        School s1 = new School("Green Valley School", "A Grade", 1200);

        System.out.println(s1);
    }
}