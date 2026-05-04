import java.util.*;
public class bike {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long bike_cost = sc.nextLong();
        sc.nextLine();
        String bike_brd = sc.nextLine();
        String bike_clr = sc.next();
        System.out.println("Cost of the Bike: " + bike_cost);
        System.out.println("Brand of the bike: " + bike_brd);
        System.out.println("Color of the Bike: " + bike_clr);
        sc.close();


    }
    
}
