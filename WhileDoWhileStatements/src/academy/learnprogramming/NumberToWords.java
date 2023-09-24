/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class NumberToWords {
    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println(INVALID_VALUE_MESSAGE);
        }else if(number == 0){
            System.out.println("Zero");
        }else{
            
            int reversedNumber = reverse(number);
            int oldReverseNumber = reversedNumber;
            int lastDigit;
            
            while(reversedNumber > 0){
                lastDigit = reversedNumber % 10;
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        throw new AssertionError();
                }
                reversedNumber/=10;
                
            }
            
            if(getDigitCount(number) > getDigitCount(oldReverseNumber)){
                for(int i = getDigitCount(oldReverseNumber); i<getDigitCount(number); i++){
                    System.out.println("Zero");
                }
            }
            
            
        }
    }
    
    public static int reverse(int number){
        
        boolean negative = false;
        int reverse = 0;
        if(number < 0){
            number =-number;
            negative = true;
        }
        int last;
        while(number > 0){
            last = number % 10;
            reverse = (reverse + last) *10;
            number = number / 10;
        }
        reverse/=10;
        
        if(negative){
            reverse = -reverse;
            //System.out.println("reverse -> " + reverse);
        }
        return reverse;
    }
    
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 1;
        }
        int index = 0;
        while (number > 0){
            //System.out.println("number -> "+ number);
            number/=10;
            index ++;
        }
        return index;
    }
}
