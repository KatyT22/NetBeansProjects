/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.inheritance.exercises;

/**
 *
 * @author katy
 */
public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width,  double length, double height) {
        super(width, length);
        this.height = height;
        if(height < 0){
            this.height = 0;
        }
    }

    public double getHeight() {
        return this.height;
    }
    
    public double getVolume(){
        return (getArea() * this.height);
    }
}