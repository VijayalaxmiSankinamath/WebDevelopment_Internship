import java.util.Scanner;

public class school {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sch_name = sc.nextLine();
        char grade = sc.next().charAt(0);
       int strength = sc.nextInt();
       System.out.println("Name of the school :" + sch_name);
       System.out.println("Grade of the school :" + grade);
       System.out.println("Strength of the school :" + strength);
       sc.close();
   }
}
