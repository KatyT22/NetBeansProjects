/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.arraylist.challenge;
import java.util.Scanner;

/**
 *
 * @author katy
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    
    private static MobilePhone mobilePhone = new MobilePhone();
    
    public static void main(String[] args) {
       boolean quit = false;
       startPhone();
       showMenu();

        while(!quit){
            int choice = getMenuNumber();
            switch (choice) {
                case 0:
                    shutDownPhone();
                    quit = true;
                    break;
                case 1:
                    showAllContacts();
                    break;
                case 2:
                    storeContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    showMenu();
                    break;
                default:
                    System.out.println("No such number in menu.");
                    break;
            }
        }
        
    }
    
    public static void startPhone(){
        System.out.println("Starting phone...");
       
    }
    public static void shutDownPhone(){
        System.out.println("Shutting phone down...");
        scanner.close();
    }
    
    public static void showMenu(){
        System.out.println("Menu :");
        System.out.println("0 - Shut down mobile phone.");
        System.out.println("1 - Show all contacts.");
        System.out.println("2 - Add new contact.");
        System.out.println("3 - Update existing contact.");
        System.out.println("4 - Remove existing contact.");
        System.out.println("5 - Search contact.");
        System.out.println("6 - Show menu.");
    }
    
    public static int getMenuNumber(){
        System.out.print("Choose action (6 - Show menu): ");
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    public static void storeContact(){
        System.out.println("Enter new contact name:");
        String contact = scanner.nextLine();
        System.out.println("Enter contact phone number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("2 - Storing contact:");
        if(mobilePhone.addNewContact(Contact.createContact(contact, phoneNumber))){
             System.out.println("Contact "+contact+" ["+phoneNumber+"] has been stored.");
        }else{
            System.out.println("Contact "+contact+" is already in contact list.");
        }
    }
    
    public static void modifyContact(){
        System.out.println("Enter contact name to modify:");
        String oldContact = scanner.nextLine();
        System.out.println("3 - Modifying contact: ");
        if(mobilePhone.hasContact(oldContact)){
            System.out.println("Enter new contact name:");
            String newContact = scanner.nextLine();
            System.out.println("Enter new contact phone number:");
            String newPhoneNumber = scanner.nextLine();
            if(mobilePhone.updateContact(mobilePhone.getContact(oldContact), Contact.createContact(newContact, newPhoneNumber))){
                System.out.println("Contact "+oldContact+" has been replaced by "+newContact+" contact.");
            }else{
                System.out.println("Error modifying contact.");
            }
        }else{
            System.out.println("Contact "+oldContact+" has not been found.");
        }
    }
    
    public static void removeContact(){
        System.out.println("Enter contact to remove:");
        String contact = scanner.nextLine();
        System.out.println("4 - Remove contact: ");
        if(mobilePhone.removeContact(contact)){
            System.out.println("Contact "+contact+" has been removed.");
        }else{
            System.out.println("Contact "+contact+" has not been found.");
        }
    }
    
    public static void searchContact(){
        System.out.println("Enter contact to search:");
        String contact = scanner.nextLine();
        System.out.println("5 - Searching contact: ");
        Contact retrievedContact = mobilePhone.getContact(contact);
        if(retrievedContact != null){
            System.out.println("Contact "+retrievedContact.getName()+" ["+retrievedContact.getPhoneNumber()+"]"+" has been found.");
        }else{
            System.out.println("Contact "+contact+" has not been found.");
        }
    }
    
    public static void showAllContacts(){
        System.out.println("1 - Showing all contacts:");
        if(mobilePhone == null || mobilePhone.getContactList() == null){
            System.out.println("No contacts added yet");
        }else{
            mobilePhone.printContactList();
        }
    }
}
