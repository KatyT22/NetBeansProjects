/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean condition1 = (!summer && ((temperature >= 25) && (temperature <= 35)));
        boolean condition2 = (summer && ((temperature >= 25) && (temperature <= 45)));
        return condition1 || condition2;
    }
}
