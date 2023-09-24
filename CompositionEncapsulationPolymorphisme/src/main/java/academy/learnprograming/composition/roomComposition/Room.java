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
public class Room {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Bed_ bed;
    private Cupboard cupboard;
    private Bureau bureau;
    private BedsideTable bedsideTable;
    private int window;
    private Dimensions dimensions;

    public Room(String name, Bed_ bed, Cupboard cupboard, Bureau bureau, BedsideTable bedsideTable, int window, Dimensions dimensions) {
        this.name = name;
        this.wall1 = new Wall("West", "white", 300);
        this.wall2 = new Wall("East", "white", 300);
        this.wall3 = new Wall("South", "white", 300);
        this.wall4 = new Wall("North", "white", 300);
        this.bed = bed;
        this.cupboard = cupboard;
        this.bureau = bureau;
        this.bedsideTable = bedsideTable;
        this.window = window;
        this.dimensions = dimensions; 
    }

    
    public void listAllElements(){
        listInfo();
        System.out.println("Composition of the room "+this.name);
        getBed().listAllElements();
        getCupboard().listInfo();
        this.cupboard.listAllElements();
        getBureau().listInfo();
        this.bureau.listAllElements();
        getBedsideTable().listInfo();
        this.bedsideTable.listAllElements();
    }

     public void listInfo(){
        System.out.println("- Info of the room.");
        System.out.println("- "+this.window + " window(s)");
        getDimensions();
    }

    private Dimensions getDimensions() {
        System.out.println("- Dimensions: "+dimensions.getWidth()+", "+dimensions.getDepth()+", "+dimensions.getHeight());
        return dimensions;
    }
    
    public void makeBed(){
        System.out.println("Task 'Making bed' activated");
            this.bed.make();
        }

    
    private Bed_ getBed() {
        System.out.println("- A bed ");
        return this.bed;
    }

    private Cupboard getCupboard() {
        System.out.println("- A cupboard ");
        return this.cupboard;
    }

    private Bureau getBureau() {
        System.out.println("- A bureau ");
        return this.bureau;
    }

    private BedsideTable getBedsideTable() {
        System.out.println("- A bedside table ");
        return this.bedsideTable;
    }

}
