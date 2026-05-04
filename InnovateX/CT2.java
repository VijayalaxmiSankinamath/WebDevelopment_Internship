class InvalidMarks extends Exception {
    
}
class Student {
    static void checkMarks(int marks) throws InvalidMarks {
        if (marks >= 0 && marks <= 100) {
            System.out.println("Valid Marks");
        } else {
            throw new InvalidMarks();
        }
    }
}
public class CT2 {
    public static void main(String[] args) {
        try {
            Student.checkMarks(120);
        } catch (InvalidMarks e) {
            System.out.println("NOT VALID");
        }
    }
}