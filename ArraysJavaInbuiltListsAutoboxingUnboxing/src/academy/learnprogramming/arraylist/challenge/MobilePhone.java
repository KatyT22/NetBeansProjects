/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.arraylist.challenge;

import java.util.ArrayList;

/**
 *
 * @author katy
 */
public class MobilePhone {
   
    private ArrayList<Contact> contactList = new ArrayList<Contact>();;
    
    public boolean addNewContact(Contact contact){
        if(contactList.isEmpty()){
            contactList.add(contact);
            return true;
        }else{
            if(findContact(contact.getName()) != -1){
                //System.out.println("Contact with name "+ contact.getName()+" already exists. Add contact not successful.");
                return false;
            }else{
                contactList.add(contact);
                return true;
            }
        }
    }
    
    public boolean updateContact(Contact oldContact, Contact newContact){
        int positionOldContact = findContact(oldContact);
        if(positionOldContact < 0){
            return false;
        }else{
            if(findContact(newContact.getName()) != -1){
                System.out.println("Contact with name "+ newContact.getName()+" already exists. Update contact not successful.");
                return false;
            }else{
                contactList.set(positionOldContact, newContact);
                return true;
            }
        }
    }
    
    private int findContact(Contact contact){
        return contactList.indexOf(contact);
    }
    
    private int findContact(String name){
        int index = 0;
        for(Contact contact : contactList){
            index ++;
            if(contact.getName().equals(name)){
                return index;
            }
        }
        return -1;
    }
    
    public boolean hasContact(String name){
        int position = findContact(name);
        return (position >= 0);
    }
     
    public Contact getContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return contactList.get(position-1);
        }else{
            return null;
        }
    }
    
    public boolean removeContact(String name){
        int position = findContact(name);
        if(position >= 0){
            contactList.remove(position);
            return true;
        }
        return false;
    }

    public void printContactList(){
        int index = 1;
        for(Contact contact : this.contactList){
            System.out.println((index++)+". "+contact.getName()+" ["+contact.getPhoneNumber()+"]");
        }
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

}
