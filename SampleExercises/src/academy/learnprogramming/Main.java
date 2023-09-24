package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author katy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String [] s = new String[]{"er", "rt", "io"};
        String [] s1 = new String[]{"er", "rt", "i"};
        
        SpeedConverter.printConversion(10.5d);
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        System.out.println("\nShouldWakeUp -> "+BarkingDog.shouldWakeUp(false, 2));
        System.out.println("\nisLeapYear -> "+LeapYear.isLeapYear(1924));
        System.out.println("\nisLeapYear2 -> "+LeapYear.isLeapYear2(1924));
        System.out.println("\nareEqualByThreeDecimalPlaces -> "+DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println("\nhasEqualSum -> "+EqualSumChecker.hasEqualSum(1, -1, 0));
        System.out.println("\nhasTeen -> "+TeenNumberChecker.hasTeen(22, 23, 34));
        System.out.println("\ncalcFeetAndInchesToCentimeters -> " + FeetInchesCentimeters.calcFeetAndInchesToCentimeters(6, 5));  
        System.out.println("\ngetDurationString -> "+SecondsAndMinutes.getDurationString(65, 9));
        
        System.out.println("\n\nMath.addExact -> 2 + 5 = " +Math.addExact(2, 5));
        System.out.println("Math.min with long -> "+Math.min(2586983456865463L, 36763752427524524L));
        System.out.println("Math.max with long -> "+Math.min(2586983456865463L, 36763752427524524L));
        System.out.println("Math.floor -> "+Math.floor(25454.00002));
        System.out.println("Math.ceil (arrondi dans tous les cas)-> "+Math.ceil(25454.00002));
        System.out.println("Math.round -> "+Math.round(25454.00002));
        System.out.println("Math.divideExact with long -> "+Math.divideExact(3L, 2L));
        System.out.println("Math.ceilDiv with long -> "+Math.ceilDiv(3L, 2L));
        System.out.println("Math.floorDiv with long -> "+Math.floorDiv(3L, 2L));
        System.out.println("Arrays.asList -> "+Arrays.asList(s1));
        System.out.println("Arrays.compare -> "+Arrays.compare(s, s1));
        System.out.println("Arrays.mismatch -> "+Arrays.mismatch(s, s1));
        char [] c = s[0].toCharArray();
        String s2 = new String(c);
        
        System.out.println("Area -> " + AreaCalculator.area(5d));
        System.out.println("Area -> " + AreaCalculator.area(5d, 4d));
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
        IntEqualityPrinter.printEqual(1, 2, 3);
        System.out.println("isCatPlaying -> "+PlayingCat.isCatPlaying(false, 35));
        
        
    }
    
}
