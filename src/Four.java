public class Four extends BaseClass implements Print {
    private String email;

    public Four(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void print() {
        System.out.println("FourthClass - Name: " + getName() + ", Email: " + email);
    }
}

