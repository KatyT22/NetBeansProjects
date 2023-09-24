/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.composition.challenge;

/**
 *
 * @author katy
 */
public class Item_v1 {
    private String name;
    private double price;

    public Item_v1(String name) {
        this.name = name;
        this.setPrice(this.name);
    }

    public Item_v1(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(String name){
        this.name = name;
        switch (this.name.toLowerCase()) {
            case "classic bread roll":
                this.price = 4.5;
                
                break;
            case "brown rye bread roll":
                this.price = 5.75;
                break;
            case "steak":
                this.price = 5;
                break;
            case "chips":
                this.price = 2.5;
                break;
            case "drinks":
                this.price = 2;
                break;
            case "classic lettuce":case "roquette lettuce":case "tomato":
            case "black tomato":case "gouda cheese":case "parmesan cheese":
            case "carot":case "Cucumber":
                this.price = 1;
                break;
            case "potato":
                this.price = 3;
                break;
            case "onion crips":
                this.price = 3.2;
                break;
            case "wrap":
                this.price = 3.5;
            default:
                System.out.println("No items found");
                break;
        }
       
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
