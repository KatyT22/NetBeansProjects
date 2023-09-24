/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class FlourPack {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if((bigCount<0) || (smallCount<0) || (goal<0)){
            return false;
        }
        int divisor = goal/5;
        int finalDivisor = (divisor<bigCount?divisor:bigCount); 
        
        return (((finalDivisor*5)+smallCount) >= goal);
    }
}
