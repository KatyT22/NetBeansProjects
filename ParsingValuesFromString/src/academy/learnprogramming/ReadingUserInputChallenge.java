/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

import java.util.Scanner;

/**
 *
 * @author katy
 */
public class ReadingUserInputChallenge {
    public static final String INVALID_NUMBER_MESSAGE = "Invalid number";
    
    
    public static void sumNumbers(int count){
        if(count < 1){
            System.out.println(INVALID_NUMBER_MESSAGE);
        }else{
            Scanner scanner = new Scanner(System.in);
            int index =0;
            int sum = 0;

            while(index < count){
                System.out.println("Enter number #"+(index+1)+": ");
                boolean hasNextInt = scanner.hasNextInt();
                if(hasNextInt){
                    int number = scanner.nextInt();
                    sum += number;
                    index++;
                }else{
                    System.err.println(INVALID_NUMBER_MESSAGE);
                }
                scanner.nextLine();
            }
            System.out.println("Sum of numbers is "+sum);
            scanner.close();
        }
    }
    
    
    public static void minMaxNumber(){
        System.out.println("Min Max Number (quit with a latin digit ex. 'a')");
        Scanner scanner = new Scanner (System.in);
        
        int index = 0;
        //int nim = Integer.MAX_VALUE;
        //int max = Integer.MIN_VALUE;
        int minimum = 0;
        int maximum = 0;
       
        
        while(true){
            System.out.println("Enter number #"+(index+1)+": ");
            boolean isInt = scanner.hasNextInt();
         
            if(isInt){
                int number = scanner.nextInt();
                
                if(index == 0){
                  
                    minimum = number;
                    maximum = number;
                    
                    
                }else{               
                    maximum = Math.max(maximum, number);
                    minimum = Math.min(minimum, number);
                }
                System.out.println("Min = "+minimum+" ; Max = "+maximum);
                index++;
            }else{
                
                System.out.println(INVALID_NUMBER_MESSAGE);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
