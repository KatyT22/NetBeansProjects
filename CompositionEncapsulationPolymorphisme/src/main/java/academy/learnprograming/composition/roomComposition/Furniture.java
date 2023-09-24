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
public class Furniture {
    private String model;
    private Dimensions dimensions;
    private String name;

    public Furniture(String model, Dimensions dimensions, String name) {
        this.model = model;
        this.dimensions = dimensions;
        this.name = name;
    }

    public void listInfo(){
        System.out.println("   --- Info of the "+this.name);
        getModel();
        getDimensions();
    }
    
    public void listAllElements(){
        System.out.println("   --- Composition of the "+this.name);
    }

    private String getName() {
        return this.name;
    }

    private String getModel() {
        System.out.println("   --- Model: "+this.model);
        return this.model;
    }

    private Dimensions getDimensions() {
        System.out.println("   --- Dimensions: "+dimensions.getWidth()+", "+dimensions.getDepth()+", "+dimensions.getHeight());
        return this.dimensions;
    }
}
