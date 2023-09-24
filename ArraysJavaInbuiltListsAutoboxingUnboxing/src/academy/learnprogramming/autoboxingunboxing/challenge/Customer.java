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
public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    private double initialAmount;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
        System.out.println("Info: customer "+this.name+" created.");
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    
    public void printCustomer(){
        System.out.println("Customer's name: "+this.name);
    }

    public double accountAmount(){
        double sum = 0;
        for(int i=0; i<transactions.size(); i++){
            sum +=transactions.get(i);
        }
        return sum;
    }
    
    public void addTransaction(double amount){
        if((accountAmount()+amount) >= 0){
            transactions.add(amount);
            System.out.println("Info: amount "+amount+" added to customer "+this.name+".");
        }else{
            System.out.println("Info: could not add amount of "+amount+", not enough money.");
        }
    }
    
    public void printTransactions(){
        int index = 1;
        for(Double amount : this.transactions){
            System.out.println((index++)+" -> "+amount);
        }
    }
}
