/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.autoboxingunboxing.challenge;
import java.util.Scanner;

/**
 *
 * @author katy
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("ABIGBANK");
    public static void main(String[] args) {
        
        bank.addNewBranch("A");
        bank.addANewCustomer("A", "Ann", 64.21);
        bank.addATransaction("A", "Ann", 48.69);
        bank.addANewCustomer("A", "Arthur", 123.79);
        bank.addATransaction("A", "Arthur", 50.3);
        
        bank.addNewBranch("B");
        bank.addANewCustomer("B", "Bernard", 52.14);
        bank.addANewCustomer("B", "Bob", 56.17);
        bank.addANewCustomer("B", "Bonnie", 16.99);
        bank.addATransaction("B", "Bonnie", -5.5);
        
        bank.addNewBranch("C");
        bank.addANewCustomer("C", "Celine", 30);
        bank.addATransaction("CB", "Celine", 35.6);
        
        boolean quit = false;
        openBank();
        showMenu();

        while(!quit){
            int choice = getMenuNumber();
            switch (choice) {
                case 0:
                    printBranches();
                    break;
                case 1:
                    addBranch();
                    break;
                case 2:
                    removeBranch();
                    break;
                case 3:
                    printCustomers();
                    break;
                case 4:
                    printAllCustomers();
                    break;
                case 5:
                    addCustomer();
                    break;
                case 6:
                    removeCustomer();
                    break;
                case 7:
                    addCustomerTransaction();
                    break;
                case 8:
                    printCustomerTransaction();
                    break;
                case 9:
                    printAllCustomerTransactions();
                    break;
                case 10:
                    showMenu();
                    break;
                case 11:
                    closeBank(); //print customer and transaction
                    quit = true;
                    break;
                default:
                    System.out.println("No such number in menu.");
                    break;
            }
        }
        
       
        
    }
    
    public static void openBank(){
        System.out.println("Opening bank "+bank.getName());
       
    }
    public static void closeBank(){
        System.out.println("closing bank "+bank.getName());
        scanner.close();
    }
    
    public static void showMenu(){
        System.out.println("Menu :");
        System.out.println("0 - Print branches.");
        System.out.println("1 - Add a branch.");
        System.out.println("2 - remove a branch.");
        System.out.println("3 - Print customers.");
        System.out.println("4 - Print All customers.");
        System.out.println("5 - Add a customer.");
        System.out.println("6 - Remove a customer.");
        System.out.println("7 - Add a customer transaction.");
        System.out.println("8 - Print customers transactions.");
        System.out.println("9 - Print All customers transactions.");
        System.out.println("10 - Show menu.");
        System.out.println("11 - Quit.");
    }
    
    public static int getMenuNumber(){
        System.out.print("Choose action (6 - Show menu): ");
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }
    
    public static void printBranches(){
        System.out.println("0 - Print branches.");
        bank.printBranch();
    }
    
    public static void addBranch(){
        System.out.println("1 - Add a branch.");
        System.out.println("Enter branch's name: ");
        String branchName = scanner.nextLine();
        bank.addNewBranch(branchName);
    }
    
    public static void removeBranch(){
        System.out.println("2 - remove a branch.");
        System.out.println("Enter branch's name: ");
        String branchName = scanner.nextLine();
        bank.removeBranch(branchName);
    }
    
   public static void printCustomers(){
        System.out.println("3 - Print customers.");
        System.out.println("Enter branch's name: ");
        String branchName = scanner.nextLine();
        Branch aBranch = bank.findBranch(branchName);
        if(aBranch != null){
            aBranch.printCustomers(false);
        }else{
            System.out.println("No such branch.");
        }
   }
   
    public static void printAllCustomers(){
        System.out.println("4 - Print customers.");
        bank.printCustomers(false);
   }
   
   public static void addCustomer(){
       System.out.println("5 - Add a customer.");
       System.out.println("Enter branch's name: ");
       String branchName = scanner.nextLine();
       System.out.println("Enter customer's name: ");
       String customerName = scanner.nextLine();
       System.out.println("Enter initial amount: ");
       int initialAmount = scanner.nextInt();
       scanner.nextLine();
       bank.addANewCustomer(branchName, customerName, initialAmount);
   }
   
   public static void removeCustomer(){
       System.out.println("6 - Remove a customer.");
       System.out.println("Enter branch's name: ");
       String branchName = scanner.nextLine();
       
       Branch aBranch = bank.findBranch(branchName);
       if(aBranch != null){
            System.out.println("Enter customer's name: ");
            String customerName = scanner.nextLine();
            aBranch.removeCustomer(customerName);
       }else{
            System.out.println("No such branch.");
        }
   }
   
   public static void addCustomerTransaction(){
        System.out.println("7 - Add a customer transaction.");
        System.out.println("Enter branch's name: ");
        String branchName = scanner.nextLine();

        Branch aBranch = bank.findBranch(branchName);
        if(aBranch != null){
            System.out.println("Enter customer's name: ");
            String customerName = scanner.nextLine();
            if(aBranch.isCustomer(customerName)){
                System.out.println("Enter amount: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                bank.addATransaction(branchName, customerName, amount);
            }else{
                System.out.println("No such customer.");
            }
        }else{
            System.out.println("No such branch.");
        }
   }
   
   public static void printCustomerTransaction(){
       System.out.println("8 - Print customers transactions.");
        System.out.println("Enter branch's name: ");
        String branchName = scanner.nextLine();

        Branch aBranch = bank.findBranch(branchName);
        if(aBranch != null){
            bank.printCustomers(aBranch.getName(), true);
        }
   }
   
   public static void printAllCustomerTransactions(){
       System.out.println("9 - Print All customers transactions.");
       bank.printCustomers(true);
   }
   
}
