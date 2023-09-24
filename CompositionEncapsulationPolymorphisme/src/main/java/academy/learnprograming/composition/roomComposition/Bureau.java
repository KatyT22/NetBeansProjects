/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.composition.roomComposition;

import academy.learnprograming.composition.Dimensions;

/**
 *
 * @author katy
 */
public class Bureau extends Furniture{
    private String model;
    private Dimensions dimensions;
    private int drawer;

    public Bureau(String model, Dimensions dimensions, int drawer) {
        super(model, dimensions, "Bureau");
        this.drawer = drawer;
    }

    @Override
    public void listAllElements(){
        super.listAllElements();
        getDrawer();
    }
   
    private int getDrawer() {
        System.out.println("   --- "+this.drawer+" drawer(s)");
        return this.drawer;
    }
    
    
}
