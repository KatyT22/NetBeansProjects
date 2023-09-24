/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.inheritance;

/**
 *
 * @author katy
 */
public class Twingo extends Car{
    private int roadServiceMonths;
    public Twingo(int roadServiceMonths) {
        super(4, 3, false, 5, "Twingo2", 600, 1.90, 1.60);
        this.roadServiceMonths = roadServiceMonths;
    }
    
    public void accelerate(int rate){
        int newVelocity = getVelocity() + rate;
        if(newVelocity == 0){
            stop();
            changingGear(1);
        }else if(newVelocity > 0 && newVelocity <= 10){
            changingGear(1);
        }else if(newVelocity > 10 && newVelocity <= 20){
            changingGear(2);
        }else if(newVelocity > 20 && newVelocity <= 30){
            changingGear(3);
        }else if(newVelocity > 30 && newVelocity <= 50){
            changingGear(4);
        }else{
            changingGear(5);
        }
        
        if(newVelocity > 0){
            move(newVelocity, getDirection());
        }
    }
    
    public void printInfo(){
        System.out.println("Name : "+getName());
        System.out.println("Weight : "+getWeight());
        System.out.println("Height : "+getHeight());
        System.out.println("Length : "+getLength());
        System.out.println("Wheels : "+this.getWheels());
        System.out.println("Is Manual : "+this.isIsManual());
        System.out.println("Gear : "+this.getGear());
        System.out.println("Road service months : "+this.roadServiceMonths);
    }
}
