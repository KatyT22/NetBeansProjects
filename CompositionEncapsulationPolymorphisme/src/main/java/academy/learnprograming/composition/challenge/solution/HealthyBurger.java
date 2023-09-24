/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.composition.challenge.solution;

/**
 *
 * @author katy
 */

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    
    private String healthyExtra2Name;
    private double healthyExtra2Price;
    
   

    public HealthyBurger(String meat, double price){
        super("Healthy Burger", meat, price, "Brown rye");
    }
    
    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.println("Added "+this.healthyExtra1Name+" for an extra "+this.healthyExtra1Price);
    }
    
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        System.out.println("Added "+this.healthyExtra2Name+" for an extra "+this.healthyExtra2Price);
    }
    
    @Override
    public double itemizeHamburger(){
        double _price = super.itemizeHamburger();
        if(this.healthyExtra1Name != null){
            _price += this.healthyExtra1Price;
        }
        
        if(this.healthyExtra2Name != null){
            _price += this.healthyExtra2Price;
        }
        
        return _price;
    }
    
}

