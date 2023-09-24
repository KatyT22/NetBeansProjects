/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.inheritance.exercises;

/**
 *
 * @author katy
 */
public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        if(height < 0){
            this.height = 0;
        }
    }

    public double getHeight() {
        return height;
    }
    
    public double getVolume(){
        return getArea() * this.height;
    }
    
    
}
