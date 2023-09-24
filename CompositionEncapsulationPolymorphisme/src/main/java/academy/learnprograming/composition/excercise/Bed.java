/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.composition.excercise;

/**
 *
 * @author katy
 */
public class Bed {
    private String style;
    private int pillows;
    private int sheets;
    private int quilt;
    private int height;

    public Bed(String style, int pillows, int sheets, int quilt, int height) {
        this.style = style;
        this.pillows = pillows;
        this.sheets = sheets;
        this.quilt = quilt;
        this.height = height;
    }
    
    public void make(){
        System.out.println("Bed -> Making | ");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public int getHeight() {
        return height;
    } 
}
