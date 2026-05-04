import java.util.*;
public class car { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       long cost = sc.nextLong();
       String mod_name = sc.next();
       String type = sc.next();
       System.out.println("Cost of the car :" + cost);
       System.out.println("car model name :" + mod_name);
       System.out.println("color of the car :" + type);
       sc.close();

    }
    
}
