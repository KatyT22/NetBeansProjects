/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class MinutesToYearsDaysCalculator {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println(INVALID_VALUE_MESSAGE);
        }
        else{
            long remainingMinutes = minutes % 60;
            long hours = (minutes / 60);
            long days = (hours / 24);
            
            long years = (days / 365);
            long remainingDays = (days % 365);
            
            System.out.println(minutes + " min = "+years+" y and "+remainingDays+" d");
        }
    }    
}
