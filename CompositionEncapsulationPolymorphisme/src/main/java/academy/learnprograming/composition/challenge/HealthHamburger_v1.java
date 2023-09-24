/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.composition.challenge;

/**
 *
 * @author katy
 */
public class HealthHamburger_v1 extends Hamburger_v1{

    private Item_v1 addition5;
    private Item_v1 addition6;
    private double totalPrice;

    public HealthHamburger_v1() {
        super("Health Hamburger", new Item_v1("Brown Rye Bread Roll"));
        
    }
    
    public void addExtra5(String name){
        this.addition5 = new Item_v1(name);
        System.out.println("   Extra 5: "+this.addition5.getName()+" for "+ this.addition5.getPrice());
    }
    
    public void addExtra6(String name){
        this.addition6 = new Item_v1(name);
        System.out.println("   Extra 6: "+this.addition6.getName()+" for "+ this.addition6.getPrice());
    }

    @Override
    public double getTotalPrice() {
        
        this.totalPrice = 0;
        if(this.addition5 != null){
            this.totalPrice += this.addition5.getPrice();
        }
        if(this.addition6 != null){
            this.totalPrice += this.addition6.getPrice();
        }
        
        this.totalPrice = (this.totalPrice + super.getTotalPrice());
        
        return this.totalPrice;
        
    }

}
