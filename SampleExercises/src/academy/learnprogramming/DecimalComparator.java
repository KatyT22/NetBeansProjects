/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        //les parenthèses sont importantes sinon le cast est fait avant de multiplier par 1000
        return ((int)(num1 * 1000) == (int)(num2 * 1000));
    }
}
