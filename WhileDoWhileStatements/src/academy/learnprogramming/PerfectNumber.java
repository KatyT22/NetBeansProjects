/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        
        int index = 1;
        int sum = 0;
        while(index < number){
            if((number % index) == 0){
                sum+=index;
                System.out.println("divisor -> " + index);
            }
            index ++;
        }
        
        return (sum == number);
    }
}
