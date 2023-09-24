/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class AreaCalculator {
    
    public static double area(double radius){
        if(radius < 0){
            return -1d;
        }
        return (Math.PI * Math.pow(radius, 2));
    }
    
    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return -1d;
        }
        
        return (x * y);
    }
}
