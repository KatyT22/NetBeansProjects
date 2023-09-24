package academy.learnprogramming;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author katy
 */
public class FeetInchesCentimeters {
    
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            int feet = (int) (inches / 12);
            int leftInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, leftInches);
        }else
            return -1;
    }
    
    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if((feet >= 0) && ((inches >= 0) && (inches <= 12))){
            double centimeters = (((feet * 12) + inches) * 2.54);
            System.out.println(feet+" feet and "+inches+" inches = "+centimeters+" centimeters");
            return centimeters;
        }else{
            return -1;
        }
    }
}
