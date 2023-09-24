/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        int lastDigit;
        
        while(number > 0){
            lastDigit = number % 10;
            System.out.println("lastDigit "+lastDigit);
            number /=10;
            if((lastDigit % 2) == 0){
                System.out.println(" -> It is even !");
                sum+=lastDigit;
            }
            
        }
        return sum;
    }
}
