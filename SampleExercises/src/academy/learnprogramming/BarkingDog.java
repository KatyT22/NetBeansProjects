/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class BarkingDog {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay){
        
        boolean wakeUp = false;
        if(hourOfDay >= 0 && hourOfDay <= 23){
            if(barking && (hourOfDay < 8 || hourOfDay > 22)){
                wakeUp = true;
            }
        }
        return wakeUp;
    }
}
