/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class NumberPalindrome {
    
    
    public static boolean isPalindrome(int number){
       int oldNumber = number;
        boolean negative = false;
        int reverse = 0;
        if(number < 0){
            number =-number;
            negative = true;
        }
        int last = 0;
        while(number > 0){
            last = number % 10;
            reverse = (reverse + last) *10;
            number = number / 10;
        }
        reverse/=10;
        
        if(negative){
            reverse = -reverse;
            System.out.println("reverse -> " + reverse);
        }
        
        return (reverse == oldNumber);
    }
}
