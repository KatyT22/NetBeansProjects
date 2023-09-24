/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.composition;

/**
 *
 * @author katy
 */
public class Car extends Vehicle{
    private int doors;
    private int engineCapacity;

    public Car(int doors, int engineCapacity, String name) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
    
    
    
}
