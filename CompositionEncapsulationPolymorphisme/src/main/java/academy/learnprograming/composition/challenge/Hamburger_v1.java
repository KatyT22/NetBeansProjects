/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.composition.challenge;

/**
 *
 * @author katy
 */
public class Hamburger_v1 {
    private String name;
    private Item_v1 breadRollType;
    private Item_v1 meat;
    private Item_v1 addition1;
    private Item_v1 addition2;
    private Item_v1 addition3;
    private Item_v1 addition4;
    private double basePrice;
    private double totalPrice;

     public Hamburger_v1(String name, Item_v1 breadRollType) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = new Item_v1("Steak");
    }

     public void addExtra1(String name){
        this.addition1 = new Item_v1(name);
        System.out.println("   Extra 1: "+this.addition1.getName()+" for "+ this.addition1.getPrice());
     }
     
     public void addExtra2(String name){
        this.addition2 = new Item_v1(name);
        System.out.println("   Extra 2: "+this.addition2.getName()+" for "+ this.addition2.getPrice());
     }
     
     public void addExtra3(String name){
        this.addition3 = new Item_v1(name);
        System.out.println("   Extra 3: "+this.addition3.getName()+" for "+ this.addition3.getPrice());
     }
     
     public void addExtra4(String name){
        this.addition4 = new Item_v1(name);
        System.out.println("   Extra 4: "+this.addition4.getName()+" for "+ this.addition4.getPrice());
     }
     
     
    public double getBasePrice(){
        
        this.basePrice = this.meat.getPrice();
               
        if(this.addition1 != null){
            this.basePrice += this.addition1.getPrice();
        }
        if(this.addition2 != null){
            this.basePrice += this.addition2.getPrice();
        }
        if(this.addition3 != null){
            this.basePrice += this.addition3.getPrice();
        }
        
        if(this.addition4 != null){
            this.basePrice += this.addition4.getPrice();
        }
        
        return this.basePrice;
    }
    
     public double getTotalPrice(){
        this.totalPrice = (getBasePrice() + this.breadRollType.getPrice());
        return this.totalPrice;
    }

    public Item_v1 getBreadRollType() {
        return breadRollType;
    }

    public String getName() {
        return name;
    }

}
