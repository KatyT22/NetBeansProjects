/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.composition.challenge;

/**
 *
 * @author katy
 */
public class MainHamburger_v1 {
    public static void main(String[] args) {
        showItem();
        System.out.println("Your choices :");
        /*Item_v1 drink = new Item_v1("Drinks");
        Item_v1 salad = new Item_v1("Classic Lettuce");
        Item_v1 tomato = new Item_v1("Tomato");
        Item_v1 cheese = new Item_v1 ("Parmesan Cheese");
        Item_v1 carot = new Item_v1("Carot");*/
        BasicHamburger_v1 basic = new BasicHamburger_v1();
        basic.addExtra1("Parmesan Cheese");
        basic.addExtra2("Tomato");
        System.out.println(basic.getName()+" price  = "+basic.getTotalPrice()+"€");
        HealthHamburger_v1 health = new HealthHamburger_v1();
        health.addExtra1("Classic Lettuce");
        System.out.println(health.getName()+" price  = "+health.getTotalPrice()+"€");
        DeluxeHamburger_v1 deluxe = new DeluxeHamburger_v1();
        deluxe.addExtra2("Tomato");
        System.out.println(deluxe.getName()+" price  = "+deluxe.getTotalPrice()+"€");
    }
    
    public static void showItem(){
        System.out.println("Basic Hamburger : \n"
                + "1. Classic Bread Roll 4.5€\n"
                + "2. Steak (Beaf)5€\n"
                + "3. Four Extras of your choice :\n"
                + "    Classic Lettuce, Roquette Lettuce, Tomato, Black Tomato, Gouda Cheese, Parmesan Cheese, Carot, Cucumber 1€ each\n");
        System.out.println("Health Hamburger : \n"
                + "1. Brown Rye Bread Roll 5.75€\n"
                + "2. Steak (Beaf)5€\n"
                + "3. Four extras of your choice :\n"
                + "    Classic Lettuce, Roquette Lettuce, Tomato, Black Tomato, Gouda Cheese, Parmesan Cheese, Carot, Cucumber 1€ each\n"
                + "4. Two other extras of your choice :\n"
                + "    - Chips 2.5€\n"
                + "    - Potato 3€\n"
                + "    - Onion crips 3.2€\n"
                + "    - Wrap 3.5€\n"
                + "    - Drinks (Coke, Limonade, ...) 2€\n");
        System.out.println("Deluxe Hamburger : \n"
                + "1. Classic Bread Roll 4.5€\n"
                + "2. Steak (Beaf)5€\n"
                + "3. Four extras of your choice :\n"
                + "    Classic Lettuce, Roquette Lettuce, Tomato, Black Tomato, Gouda Cheese, Parmesan Cheese, Carot, Cucumber 1€ each\n"
                + "4. Two included extras :\n"
                + "    - Chips 2.5€\n"
                + "    - Drinks (Coke, Limonade, ...) 2€\n");
    }

}
