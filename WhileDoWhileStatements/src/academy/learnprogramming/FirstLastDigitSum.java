/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        
        if((number >= 0) && (number < 10)){
            return number*2;
        }
        
        int sum = 0;
        int lastDigit = number % 10;
        sum+=lastDigit;
       
        
        while(number > 0){
            number /=10;
            
            if((number > 0) && (number < 10)){
                int fistDigit = number;
                sum+=fistDigit;
                
            }
        }
        
        return sum;
    }
}
