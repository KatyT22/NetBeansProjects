/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class IntEqualityPrinter {
    
    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static final String EQUALITY_VALUE_MESSAGE = "All numbers are equal";
    public static final String DIFFERENCE_VALUE_MESSAGE = "All numbers are different";
    public static final String NO_EQUALITY_OR_DIFFERENCE_VALUE_MESSAGE = "Neither all are equal or different";
    
    public static void printEqual(int a, int b, int c){
        if((a < 0) || (b < 0) || (c < 0)){
            System.out.println(INVALID_VALUE_MESSAGE);
        }else if((a == b) && (b == c)){
            System.out.println(EQUALITY_VALUE_MESSAGE);
        }else if((a != b) && (b != c) && (a != c)){
            System.out.println(DIFFERENCE_VALUE_MESSAGE);
        }else{
            System.out.println(NO_EQUALITY_OR_DIFFERENCE_VALUE_MESSAGE);
        }
    }
    
}
