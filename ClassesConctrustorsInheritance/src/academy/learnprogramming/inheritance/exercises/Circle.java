/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.inheritance.exercises;

/**
 *
 * @author katy
 */
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        if(radius < 0){
            this.radius = 0;
        }
        
    }

    public double getRadius() {
        return radius;
    }
    
    public double getArea(){
        return (Math.pow(radius, 2) * Math.PI);
    }
}
