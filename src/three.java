public class three extends BaseClass implements Print {
    private String address;

    public three(String name, String address) {
        super(name);
        this.address = address;
    }

    @Override
    public void print() {
        System.out.println("ThirdClass - Name: " + getName() + ", Address: " + address);
    }
}
