class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)       // same reference
            return true;

        if (obj == null)       // null check
            return false;

        if (getClass() != obj.getClass())  // type check
            return false;

        Student s = (Student) obj;

        return this.id == s.id;   // comparing id
    }
}

public class MainE11 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Sanjana");
        Student s2 = new Student(101, "Sanjana");
        Student s3 = null;

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
    }
}