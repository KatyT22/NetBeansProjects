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
public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        
        int index = 0;
        int sum = 0;
        long average = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Enter a number #"+(index+1)+": ");
            boolean isLong = scanner.hasNextInt();

            if(isLong){
                int number = scanner.nextInt();
                sum+=number;
                average =  Math.round((double)sum/((double)index+1d));
            }else{
                System.out.println("SUM = "+sum+" AVG = "+average);
                break;
            }
            index ++;
            scanner.nextLine();
        }
        scanner.close();
    }
}
