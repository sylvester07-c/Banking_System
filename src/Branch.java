import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return  customers;
    }

    public boolean newCustomer(String name, double transaction) {
        Customer customer = new Customer(name, transaction);
        if(customers.add(customer)){
            return true;
        }
        return false;
    }
}
