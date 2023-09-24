/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class SharedDigit {
    
    public static boolean hasSharedDigit(int number1, int number2){
        if((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)){
            return false;
        }
        
        int lastDigitNum1;
        int lastDigitNum2;
        int oldNumber2 = number2;
        
        while(number1 > 0){
            lastDigitNum1 = number1 % 10;
            System.out.println("***lastDigitNumber 1 -> "+lastDigitNum1+"***");
            while(number2 > 0){
                lastDigitNum2 = number2 % 10;
                System.out.println("lastDigitNumber 2 -> "+lastDigitNum2);
                if(lastDigitNum1 == lastDigitNum2){
                    return true;
                }
                number2 /= 10;
            }
            number2 = oldNumber2;
            number1 /= 10;
        }
        return false;
    }
}
