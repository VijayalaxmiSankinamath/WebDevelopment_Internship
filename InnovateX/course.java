import java.util.*;
public class course {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String course_name = sc.nextLine();
        String university_name = sc.nextLine();
        int cost=sc.nextInt();
        System.out.println("name of the course: "+ course_name);
        System.out.println("Name of the university: " + university_name);
        System.out.println("Cost : " + cost);
        sc.close();
    }
    
}
