import java.util.ArrayList;

public class Branch {

    private String name;
    protected ArrayList<Customer> customers;

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

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer cus = findCustomer(name);
        if(cus != null){
            cus.addTransaction(transaction);
            return true;
        }
        return false;
    }

    public Customer findCustomer(String name) {
        for(Customer cus : customers) {
            if(cus.getName().equalsIgnoreCase(name)){
                return cus;
            }
        }
        return null;
    }
}
