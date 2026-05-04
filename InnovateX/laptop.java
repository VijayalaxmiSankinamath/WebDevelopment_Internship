import java.util.*;
public class laptop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String laptop_name=sc.nextLine();
        long cost=sc.nextLong();
        sc.nextLine();
        String laptop_brd=sc.nextLine();
        System.out.println("Name of the laptop: " + laptop_name);
        System.out.println("Cost of the laptop: " + cost);
        System.out.println("Brand of the laptop: " + laptop_brd);
        sc.close();
    }
    
}
