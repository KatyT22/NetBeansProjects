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
public class Cupboard extends Furniture{
   
    private int compartment;
    private int drawer;
    private int mirror;

    public Cupboard(String model, Dimensions dimensions, int compartment, int drawer, int mirror) {
        super(model, dimensions, "Cupboard");
        this.compartment = compartment;
        this.drawer = drawer;
        this.mirror = mirror;
    }
 
    @Override
    public void listAllElements(){
        super.listAllElements();
        getCompartment();
        getDrawer();
        getMirror();
    }

    private int getCompartment() {
        System.out.println("   --- "+this.compartment+" compartment(s)");
        return this.compartment;
    }

    private int getDrawer() {
        System.out.println("   --- "+this.drawer+" drawer(s)");
        return this.drawer;
    }

    private int getMirror() {
        System.out.println("   --- "+this.mirror+" mirror(s)");
        return this.mirror;
    } 
    
}
