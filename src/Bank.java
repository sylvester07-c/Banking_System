import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranches(String name) {
        Branch branch = new Branch(name);

        if(branches.add(branch)){
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String name, double transaction){

        Branch branch = findBranch(branchName);
        if(branch.newCustomer(name, transaction)){
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String name, double transaction) {
        Branch branch = findBranch(branchName);

        if(branch.addCustomerTransaction(name, transaction)) {
            return  true;
        }

        return false;
    }

    public Branch findBranch(String name) {
        for(Branch branch : branches) {
            if(branch.getName().equalsIgnoreCase(name)) {
                return branch;
            }
        }

        return null;
    }








}
