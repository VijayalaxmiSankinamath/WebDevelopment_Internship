import java.util.*;
class mobile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       long cost = sc.nextLong();
       String mod_name = sc.next();
       String color = sc.next();
       System.out.println("Cost of the mobile :" + cost);
       System.out.println("mobile model name :" + mod_name);
       System.out.println("color of the mobile :" + color);
       sc.close();
    }
}