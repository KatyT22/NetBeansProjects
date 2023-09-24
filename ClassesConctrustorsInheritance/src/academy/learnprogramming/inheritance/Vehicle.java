/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.inheritance;

/**
 *
 * @author katy
 */
public class Vehicle {
    private String name;
    private int velocity;
    private int direction;
    private double weight;
    private double length;
    private double height;

    public Vehicle(String name, double weight, double length, double height) {
        this.name = name;
        this.velocity = 0;
        this.direction = 0;
        this.weight = weight;
        this.length = length;
        this.height = height;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getVelocity() {
        return velocity;
    }
    
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }
    
    
    public void move(int velocity, int direction){
        this.velocity = velocity;
        this.direction = direction;
        System.out.println("Vehicle "+this.name+" moves at "+this.velocity+" at "+this.direction+" degrees");
    }
    
    
     public void steer(int direction){
        this.direction += direction;
        System.out.println("Vehicle "+this.name+" steering at "+ direction+" degrees");
    }
    
    public void stop(){
        this.velocity = 0;
    }
}
