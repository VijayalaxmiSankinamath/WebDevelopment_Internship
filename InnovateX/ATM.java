class ATM {
    private double balance;

    public void setBalance(double b) {
        if (b >= 0)
            balance = b;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        ATM a = new ATM();
        a.setBalance(5000);
        a.withdraw(1500);
        System.out.println("Remaining Balance: " + a.getBalance());
    }
}
