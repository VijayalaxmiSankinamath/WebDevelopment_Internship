class InvalidCoupon extends Exception {


}
class Shopping {

    static void applyCoupon(String code) throws InvalidCoupon {

        if (code.equals("SAVE10")) {
            System.out.println("Coupon Applied Successfully");
        } else {
            throw new InvalidCoupon();
        }
    }
}
public class CT3 {

    public static void main(String[] args) {

        try {
            Shopping.applyCoupon("ABC123");
        } 
        catch (InvalidCoupon e) {
            System.out.println("Offer Not Applied");
        }
    }
}