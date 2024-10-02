public class two extends BaseClass implements Print {
    private int age;

    public two(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("SecondClass - Name: " + getName() + ", Age: " + age);
    }
}
