/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.learnprogramming.main;

import academy.learnprogramming.arraylist.GroceryList;
import java.util.Scanner;

/**
 *
 * @author katy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++){
            System.out.println("Element "+i+", typed value was "+myIntegers[i]);
        }
        System.out.println("The average is "+getAverage(myIntegers));
 
    }
    
    public static int[] getIntegers(int number){
        System.out.println("Enter "+number +" integer values. \r");
        int[] values = new int[number];
        
        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    
    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum+=array[i];
        }
        return (double) sum / array.length;
    }
}
