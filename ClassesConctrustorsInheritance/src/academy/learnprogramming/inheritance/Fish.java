/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.inheritance;

/**
 *
 * @author katy
 */
public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(int gills, int eyes, int fins, String name, int size, int weight) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    
    private void rest(){
        System.out.println("Fish "+this.getName()+" is resting.");
    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
    
    private void moveMuscles(){
        System.out.println("Fish "+this.getName()+" is moving muscles.");
    }
    
    private void moveBackFin(){
        System.out.println("Fish "+this.getName()+" is moving back fin.");
    }
}
