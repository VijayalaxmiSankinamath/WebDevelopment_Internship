class EmployeeE {
    private double salary;

    public void setSalary(double salary) {
        if (salary >= 10000)
            this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        EmployeeE e = new EmployeeE();
        e.setSalary(25000);
        System.out.println("Salary: " + e.getSalary());
    }
}
