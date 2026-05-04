class Person {
    private int age;

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(22);
        System.out.println(p.getAge());
    }
}
