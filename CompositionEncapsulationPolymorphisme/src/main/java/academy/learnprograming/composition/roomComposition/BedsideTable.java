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
public class BedsideTable extends Furniture{
 
    private int drawer;

    public BedsideTable(String model, Dimensions dimensions, int drawer) {
        super(model, dimensions, "Bed side table");
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
