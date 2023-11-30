
public class Customer {
    private String customerName;
    private int customerAge;

    public Customer(String name, int age) {
        this.customerName = name;
        this.customerAge = age;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int age) {
        this.customerAge = age;
    }
}
