/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.composition.challenge.solution;

/**
 *
 * @author katy
 */
public class DeluxeBurger extends Hamburger{


    public DeluxeBurger(){
        super("Deluxe Burger", "Sausage", 19.10, "White");
        super.addHamburgerAddition1("Chips", 0.0);
        super.addHamburgerAddition2("Drinks", 0.0);
    }
    
    @Override
    public void addHamburgerAddition1(String name, double price){
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
    
    @Override
    public void addHamburgerAddition2(String name, double price){
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
    
    @Override
    public void addHamburgerAddition3(String name, double price){
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
    
    @Override
    public void addHamburgerAddition4(String name, double price){
        System.out.println("No additional items can be added to a deluxe burger");
    }

}
