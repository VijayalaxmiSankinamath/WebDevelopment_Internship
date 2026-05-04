import java.util.*; 
public class emp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String emp_id = sc.next();
        long emp_sal= sc.nextLong();
        char emp_grade = sc.next().charAt(0);
        System.out.println("Employee ID :" + emp_id);
        System.out.println("Employee Salary :" + emp_sal);
        System.out.println("Employee Grade :" + emp_grade);
        sc.close();

    }
    
}
