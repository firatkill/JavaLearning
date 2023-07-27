public class Customer {
    private String name;
    private int creditLimit;
    private String email;


    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public Customer() {
        this("Fırat", 1300, "firatkil.app@gmail.com");
    }


    public Customer(String name, String email) {
        this(name, 1300, email);
    }


    public Customer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
}
