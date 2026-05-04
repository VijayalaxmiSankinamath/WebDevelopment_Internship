class RectangleE {
    private int length;
    private int width;

    public void setValues(int l, int w) {
        length = l;
        width = w;
    }

    public int getArea() {
        return length * width;
    }

    public static void main(String[] args) {
        RectangleE r = new RectangleE();
        r.setValues(5, 6);
        System.out.println("Area: " + r.getArea());
    }
}
