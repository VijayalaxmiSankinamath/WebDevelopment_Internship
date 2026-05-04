
class Person {
    void display() {
        System.out.println("I am a person");
    }
}


class Student extends Person {
    void study() {
        System.out.println("I am studying");
    }
}


public class SingleL {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();  // from Person
        s.study();    // from Student
    }
}
