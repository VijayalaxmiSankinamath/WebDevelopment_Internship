class CarE {
    private int speed;

    public void setSpeed(int s) {
        if (s >= 0)
            speed = s;
    }

    public int getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        CarE c = new CarE();
        c.setSpeed(120);
        System.out.println("Speed: " + c.getSpeed());
    }
}
