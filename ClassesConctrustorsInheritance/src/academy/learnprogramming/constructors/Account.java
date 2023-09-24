/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.constructors;

/**
 *
 * @author katy
 */
public class Account {
    private String number;
    private double balance;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Account(){
        this("852453", 2.50, "Default first name", "Default last name", "Default address", "Default Phone");
        System.out.println("Constructor by default called");
    }
    
    public Account(String number, double balance, String customerFirstName, String customerLastName, String customerEmail, String cutomerPhoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerEmail = customerEmail;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerPhoneNumber = cutomerPhoneNumber;
        System.out.println("Constructor with parameters called");
    }

    public Account(String customerFirstName, String customerLastName, String customerEmail, String customerPhoneNumber) {
        this("99999", 100.55, customerFirstName, customerLastName, customerEmail, customerPhoneNumber);
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }
    
    
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    
    public void depositFunds(double depositAmount){
        if(depositAmount <= 0){
            System.out.println("Invalid deposit fund value");
        }else{
            this.balance+=depositAmount;
            System.out.println("Deposit of "+depositAmount+" made");
            System.out.println("New balance is "+this.balance);
        }
    }
    
    public void withdrawFunds(double withdrawalAmount){
        if(withdrawalAmount <= 0){ 
            System.out.println("Invalid withdraw fund value");
        }else if(withdrawalAmount > this.balance){
            System.out.println("Try to withdraw "+withdrawalAmount+" but insufficient funds");
            System.out.println("Balance is "+this.balance);
        }else{
            this.balance-=withdrawalAmount;
            System.out.println("Withdrawal of "+withdrawalAmount+" made");
            System.out.println("New balance is "+this.balance);
        }
    }
    
    public void printAccountInfo(){
        System.out.println("___");
        System.out.println("Name : "+this.customerFirstName+" "+this.customerLastName);
        System.out.println("Email : "+this.customerEmail);
        System.out.println("Phone number : "+this.customerPhoneNumber);
        System.out.println("Account number : "+this.number);
        System.out.println("Balance : "+this.balance);
    }
    
}
