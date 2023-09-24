/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.autoboxingunboxing.challenge;
import java.util.ArrayList;

/**
 *
 * @author katy
 */
public class Bank {
    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name) {
        this.branches = new ArrayList<Branch>();
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    //1. Add new branch in the bank
    public boolean addNewBranch(String branchName){
        if(!isBranch(branchName)){
            Branch aBranch = new Branch(branchName);
            this.branches.add(aBranch);
            return true;
        }
        System.out.println("Info: could not add branch "+ branchName+", already exist.");
        return false;
    }
      //2. Remove a Branch
    public boolean removeBranch(String branchName){
        int position = getBranch(branchName);
        return removeBranch(branches.get(position));
    }
    
    private boolean removeBranch(Branch aBranch){
        int position = getBranch(aBranch);
        if(position >= 0){
            this.branches.remove(aBranch);
            System.out.println("Info: branch "+ aBranch.getName()+" removed.");
            return true;
        }
        System.out.println("Info: could not remove branch "+ aBranch.getName()+", no such branch.");
        return false;
    }
    
    private boolean isBranch(String branchName){
        int position = getBranch(branchName);
        return (position >= 0);
    }
    
    private int getBranch(String branchName){
        for(int i=0; i<branches.size(); i++){
            if(branches.get(i).getName().equals(branchName)){
               return getBranch(branches.get(i));
            }
        }
        return -1;
    }
    
    private int getBranch(Branch branch){
        int position = branches.indexOf(branch);
        return position;
    }
    
    public Branch findBranch(String branchName){
        int position = getBranch(branchName);
        if(position >= 0){
            return this.branches.get(position);
        }else{
            System.out.println("Info: branch "+branchName+" does not exist.");
            return null;
        }
    }
    
    //3. Add a new customer in the bank
    public boolean addANewCustomer(String branchName, String customerName, double initialAmount){
        if(isBranch(branchName)){
            int position = getBranch(branchName);
            return branches.get(position).addNewCustomer(customerName, initialAmount);
        }else{
            System.out.println("Info: branch "+branchName+" does not exist.");
            return false;
        }
    }
    
    //4. Add a transaction in the bank
    public boolean addATransaction(String branchName, String customerName, double amount){
        if(isBranch(branchName)){
            int position = getBranch(branchName);
            return branches.get(position).addTransaction(customerName, amount);
        }
        System.out.println("Info: branch "+branchName+" does not exist.");
        return false;
    }

   
    public void printBranch(){
        int index = 1;
        for (Branch aBranch : this.branches) {
            System.out.println((index++)+". "+aBranch.getName());
        }
    }
    
    public void printCustomers(boolean showTransactions){
        int index = 1;
        for (Branch aBranch : this.branches) {
            System.out.println((index++)+". "+aBranch.getName());
            aBranch.printCustomers(showTransactions);
        }
    }
    
    //print list customers in a branch
    public void printCustomers(String branchName, boolean showTransactions){
        Branch aBranch = findBranch(branchName);
        System.out.println(aBranch.getName()+": ");
        aBranch.printCustomers(showTransactions);
       
    }
    
    //print list customers in a branch + transactions
    public void printTransactions(String branchName){
        int index = 1;
        if(isBranch(branchName)){
            Branch aBranch = this.branches.get(getBranch(branchName));
            for(Customer aCustomer : aBranch.getCustomers()){
                System.out.println((index++)+". "+aCustomer.getName());
                aCustomer.printTransactions();
            }
        }
    }

}
