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

        Branch branch = new Branch(branchName);
        if(branch.newCustomer(name, transaction)){
            return true;
        }

        return false;
    }






}
