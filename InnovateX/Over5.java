class Bank {
    void rate() {
        System.out.println("Bank interest rate");
    }
}

class SBI extends Bank {
    void rate() {
        System.out.println("SBI interest rate is 7%");
    }
}

public class Over5 {
    public static void main(String[] args) {
       SBI s = new SBI();
       s.rate();
    }
}
