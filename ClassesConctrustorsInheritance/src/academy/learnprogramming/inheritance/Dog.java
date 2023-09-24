/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.inheritance;

/**
 *
 * @author katy
 */
public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.coat = coat;
    }

   
    private void chew(){
        System.out.println("Dog "+this.getName()+" is chewing.");
    }

    @Override
    public void eat() {
        System.out.println("---Dog "+this.getName()+" is eating :");
        chew();
        super.eat();
    }
    
    public void walk(){
        System.out.println("---Dog "+this.getName()+" is walking : ");
         super.move(5);
    }
    public void run(){
        System.out.println("---Dog "+this.getName()+" is running :");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog "+this.getName()+" is moving legs at speed "+speed);
    }
    
    @Override
    public void move(int speed) {
    System.out.println("Dog "+this.getName()+" is moving at speed "+speed);
    moveLegs(speed);
    super.move(speed); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}
