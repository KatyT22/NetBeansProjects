/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class Main {
    public static void main(String[] args) {
        SwitchStatement.switchValue("FebRuaRy");
        SwitchStatement.printDayOfTheWeek(7);
        SwitchStatement.printDayOfTheWeek(6);
        SwitchStatement.printDayOfTheWeek(5);
        SwitchStatement.printDayOfTheWeek(4);
        SwitchStatement.printDayOfTheWeek(3);
        SwitchStatement.printDayOfTheWeek(2);
        SwitchStatement.printDayOfTheWeek(1);
        SwitchStatement.printDayOfTheWeek(0);
        
        SwitchStatement.printNumberInWord(0);
        SwitchStatement.printNumberInWord(1);
        SwitchStatement.printNumberInWord(3);
        SwitchStatement.printNumberInWord(5);
        SwitchStatement.printNumberInWord(15);
        
        System.out.println("isLeapYear -> "+SwitchStatement.isLeapYear(2000));
        System.out.println("getDaysInMonth -> "+SwitchStatement.getDaysInMonth(6, 2000));
        
        
        System.out.println("\ncalculateInterest -> "+ForStatement.calculateInterest(10000d, 2d));
        System.out.println("°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*");
        ForStatement.calculateInterest(2, 8);
        System.out.println("°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*");
        ForStatement.countPrimeNumbers(1, 11);
        ForStatement.sum3and5(1000);
        System.out.println("sumOdd -> "+ForStatement.sumOdd(100, 1000));
        
    }
}
