/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.constructors.exercises;

/**
 *
 * @author katy
 */
public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
        
        if(width < 0){
            this.width = 0;
        }
        
        if(length < 0){
            this.length = 0;
        }
    }
    
    public double getArea(){
        return width*length;
    }
    
}
