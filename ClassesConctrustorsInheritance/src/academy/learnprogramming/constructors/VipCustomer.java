/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.constructors;

/**
 *
 * @author katy
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default name", 100, "Default email address");
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 10, emailAddress);
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    
    public void printVipCustomerInfo(){
        System.out.println("___");
        System.out.println("Name : "+this.name);
        System.out.println("Email : "+this.emailAddress);
        System.out.println("Credit limit : "+this.creditLimit);
    }
    
    
    
}
