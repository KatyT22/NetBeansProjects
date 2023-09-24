/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class SwitchStatement {
    
    public static final String NOT_FOUND_VALUE = "Value not found";
    
    
    public static void switchValue(int value){
        
        switch(value){
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:case 4:case 5:case 6:
                System.out.println("Value is 3 or 4 or 5 or 6");
                System.out.println("Actually it was " + value);
                break;
            default:
                System.out.println(NOT_FOUND_VALUE);
                break;
        }
        
        switch(value){
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3, 4, 5, 6 -> {
                System.out.println("Value is 3 or 4 or 5 or 6");
                System.out.println("Actually it was " + value);
            }
            default ->  System.out.println(NOT_FOUND_VALUE);
        }
    }
    
    
    public static void switchValue(char value){
        switch(value){
            case 'A': 
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'C':case 'D':case 'E':
                System.out.println("Value is C or D or E");
                System.out.println("Actually value is "+value);
                break;
             default:
                 System.out.println(NOT_FOUND_VALUE);
                 break;   
        }
    }
    
    
    public static void switchValue(String month){
        switch(month.toLowerCase()){
            case "january": 
                System.out.println("Value is January");
                break;
            case "february":
                System.out.println("Value is February");
                break;
            case "march":case "april":case "may":
                System.out.println("Value is March or April or May");
                System.out.println("Actually value is "+month);
                break;
             default:
                 System.out.println(NOT_FOUND_VALUE);
                 break;  
        }
    }
    
    //printDayOfTheWeek
    public static void printDayOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println(NOT_FOUND_VALUE);
                break;
        }
    }
    
    public static final String OTHER = "OTHER";
    public static void printNumberInWord(int number){
        switch(number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println(OTHER);
                break;
        }
    }
    
    public static boolean isLeapYear(int year){
        return ((year >= 1) && (year <= 9999)) && (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }
    
    public static int getDaysInMonth(int month, int year){
        if((year < 1) || (year > 9999))
            return -1;
        switch(month){
            //1jan, 3mar, 5mai, 7juil, 8aoû,  10oct, 12déc
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                return 31;
            //fev
            case 2:
                if(isLeapYear(year))
                    return 29;
                else
                    return 28;
            //4avr, 6juin, 9sept, 11nov, 
            case 4:case 6:case 9:case 11:
                return 30;
            default:
                return -1; 
        }
    }
    
    
}
