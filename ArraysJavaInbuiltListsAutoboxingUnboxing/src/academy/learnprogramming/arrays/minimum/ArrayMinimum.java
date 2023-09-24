/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.arrays.minimum;

import java.util.Scanner;

/**
 *
 * @author katy
 */
public class ArrayMinimum {
    
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("How many numbers would you like to enter ? ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Minimum is :"+findMin(readIntegers(number)));
    }
    
    private static int[] readIntegers(int count){
        int[] integers = new int[count];
        for(int i=0; i<integers.length; i++){
            System.out.println("Enter #"+(i+1)+": ");
            integers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return integers;
    }
    
    private static int findMin(int[] array){
        int minimum = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]<minimum){
                minimum = array[i];
            }
        }
        return minimum;
    }
}
