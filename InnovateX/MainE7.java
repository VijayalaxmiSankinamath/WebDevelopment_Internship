class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        return this.id == e.id;
    }
}

public class MainE7 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Sanjana", 50000);
        Employee e2 = new Employee(101, "Anu", 60000);

        System.out.println(e1.equals(e2)); 
    }
}