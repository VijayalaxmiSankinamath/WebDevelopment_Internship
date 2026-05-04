class StudentE {

    
    private String name;
    private int rollNo;
    private double marks;

   
    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    
    public int getRollNo() {
        return rollNo;
    }

    
    public void setMarks(double marks) {
        if (marks >= 0) {
            this.marks = marks;
        } else {
            System.out.println("Marks cannot be negative!");
        }
    }

    public double getMarks() {
        return marks;
    }

   
    public static void main(String[] args) {

        StudentE s1 = new StudentE();

        
        s1.setName("Vijay");
        s1.setRollNo(101);
        s1.setMarks(85.5);

        
        System.out.println("Name: " + s1.getName());
        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Marks: " + s1.getMarks());

        s1.setMarks(-50);
    }
}
