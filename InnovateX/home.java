import java.util.*;
public class home {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String home_name = sc.nextLine();
    long cost = sc.nextLong();
    String home_color = sc.next();
    System.out.println("Name of the home: " + home_name);
    System.out.println("Cost of the home: " + cost);
    System.out.println("Color of the home: " + home_color);
    sc.close();
    }
    
}
