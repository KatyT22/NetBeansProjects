/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.inheritance;

/**
 *
 * @author katy
 */

public class Car extends Vehicle{
    
    private int currentGear;
    private int wheels;
    private int doors;
    private boolean isManual;
    private int gear;

    public Car(int wheels, int doors, boolean isManual, int gear, String name, double weight, double length, double height) {
        super(name, weight, length, height);
        this.currentGear = 1;
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.gear = gear;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isIsManual() {
        return isManual;
    }

    public int getGear() {
        return gear;
    }
    
    public void changingGear(int currentGear){
        if(currentGear > 5){
            this.currentGear = 5;
        }else if(currentGear < 0){
            this.currentGear = 0;
        } else {
            this.currentGear = currentGear; 
        }
        System.out.println("Changing gears to "+this.currentGear);
    }

    @Override
    public void move(int velocity, int direction) {
        if((velocity < 300) && (velocity >= 0) && (direction <= 180) && (direction >= -180 )){
            super.move(velocity, direction); 
            System.out.println("Car "+this.getName()+" moves at "+this.getVelocity()+" at "+this.getDirection()+" degrees");
        }else{
            System.err.println("Can not move : velocity or direction not valid (vel = 0-300; dir = 0-360)");
        }
    }

}
