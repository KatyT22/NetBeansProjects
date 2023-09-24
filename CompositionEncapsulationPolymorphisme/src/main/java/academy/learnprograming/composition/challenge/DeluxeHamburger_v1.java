/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.composition.challenge;

/**
 *
 * @author katy
 */
public class DeluxeHamburger_v1 extends Hamburger_v1{
    
    private Item_v1 chips;
    private Item_v1 drinks;
    private double totalPrice;
    
    public DeluxeHamburger_v1() {
        super("Deluxe Hamburger", new Item_v1("Classic Bread Roll"));
        this.chips = new Item_v1("Chips");
        this.drinks = new Item_v1("Drinks");
    }

    @Override
    public void addExtra4(String name) {
        System.out.println("Cannot add aditional items to "+ getName());
    }

    @Override
    public void addExtra3(String name) {
        System.out.println("Cannot add aditional items to "+ getName());
    }

    @Override
    public void addExtra2(String name) {
        System.out.println("Cannot add aditional items to "+ getName());
    }

    @Override
    public void addExtra1(String name) {
        System.out.println("Cannot add aditional items to "+ getName());
    }


    @Override
    public double getTotalPrice() {
        this.totalPrice = (super.getTotalPrice()+ this.chips.getPrice() + this.drinks.getPrice());
        return this.totalPrice;
    }
 
}
