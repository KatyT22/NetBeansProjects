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
public class Branch {
    private ArrayList<Customer> customers;
    private String name;

    public Branch(String name) {
        this.customers = new ArrayList<Customer>();
        this.name = name;
        System.out.println("Info: branch "+this.name+" created.");
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }
    
    //1. Add a customer in the branch
    public boolean addNewCustomer(String customerName, double initialAmount){
        if(!isCustomer(customerName)){
            Customer aCustomer = new Customer(customerName, initialAmount);
            this.customers.add(aCustomer);
            return true; 
        }else{
            System.out.println("Info: could not add customer "+ customerName+", already exist.");
            return false;
        }
    }
    
    //2. Remove a customer in the branch
    public boolean removeCustomer(String name){
        int position = getCustomer(name);
        return removeCustomer(customers.get(position));
    }
    
    private boolean removeCustomer(Customer aCustomer){
       int position = getCustomer(aCustomer.getName());
       if(position >= 0){
           customers.remove(aCustomer);
           System.out.println("Info: customer "+ aCustomer.getName()+" removed.");
           return true;
       }else{
           System.out.println("Info: could not remove customer "+ aCustomer.getName()+", no such customer.");
           return false;
       }
    }
    
    private int getCustomer(String customerName){
        for(int i=0; i<customers.size(); i++){
            if(customers.get(i).getName().equals(customerName)){
               return customers.indexOf(customers.get(i));
            }
        }
        return -1;
    }

    public boolean isCustomer(String customerName){
        int position = getCustomer(customerName);
        return (position >= 0);
    }
    
    //3. Add a transaction in the branch
    public boolean addTransaction(String customerName, double amount){
        if(isCustomer(customerName)){
            int position = getCustomer(customerName);
            this.customers.get(position).addTransaction(amount);
            return true;
        }
        System.out.println("Info: customer "+customerName+" does not exist.");
        return false;
    }

    
    //5. Print branch's customers
    public void printCustomers(boolean showTransactions){
        for(int i=0; i<this.customers.size(); i++){
            System.out.println((i+1)+". "+this.customers.get(i).getName());
            if(showTransactions){
                printTransactions(this.customers.get(i).getName());
            }
        }
    }

    //6. Print a customers's transactions
    private void printTransactions(String customerName){
        this.customers.get(getCustomer(customerName)).printTransactions();
    }

}
