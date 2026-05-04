import java.util.Scanner;
public class tv {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       long cost = sc.nextLong();
       String tv_brand = sc.next();
       String type = sc.next();
       System.out.println("Cost of the tv :" + cost);
       System.out.println("tv model name :" + tv_brand);
       System.out.println("type of the tv :" + type);
       sc.close();
    }
}
