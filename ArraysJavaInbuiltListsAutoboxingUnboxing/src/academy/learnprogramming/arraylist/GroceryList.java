/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.arraylist;
import java.util.ArrayList;

/**
 *
 * @author katy
 */
public class GroceryList {
    
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
    
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have "+ groceryList.size()+" items in your grocery list");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1)+ ". "+groceryList.get(i));
        }
    }
    
    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >=0 ){
            modifyGroceryItem(position, newItem);
        }
    }
    
    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item "+(position+1)+" has been modified.");
    }
    
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >=0 ){
            removeGroceryItem(position);
        }
    }
    
    private void removeGroceryItem(int positon){
        groceryList.remove(positon);
    }
    
    private int findItem(String searchItem){
       return groceryList.indexOf(searchItem);
    }
    
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        return position >=0;
    }
}
