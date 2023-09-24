/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.arrays.sort;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author katy
 */
public class MainSort {
    
    public static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        int size = 5;
        int[] array  = getIntegers(size);
        System.out.println("Before ");
        printArray(array);
        System.out.println("After ");
        printArray(sortIntegers(array)); 
        printArray(sortIntegers2(array)); 
 
    }
    
    public static int[] getIntegers(int number){
        int[] array = new int[number];
        System.out.println("Type "+number+" elements:");       
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }
    
    public static void printArray(int[] array){
        /*System.out.println("Array elements :");
        for(int i=0; i<array.length; i++){
        System.out.print(array[i]+" - ");
        }
        System.out.println("\r");*/
        System.out.println("Array elements: " +Arrays.toString(array));
    }
    
    public static int[] sortIntegers(int[] array){
        
        int temp;
        boolean swaped = true;
        while(swaped){
            swaped = false;
            for(int i = 0; i< array.length-1; i++){
               if(array[i] < array[i+1]){
                   temp = array[i];
                   array[i] = array[i+1];
                   array[i+1] = temp;
                   swaped = true;
               }
               /*sortedArray[i] = searchBiggest(array);
               array = removeBiggest(array);*/
            }
        }
        return array;
    }
    
    public static int[] sortIntegers2(int[] array){
        /*int[] sorted = new int[array.length];
        sorted = Arrays.copyOf(array, array.length);*/
        int temp;
        for(int j=0; j<array.length; j++){
            for(int i=j; i<array.length; i++){
                if(array[j] < array[i]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
    //methods below not necessary
    public static int searchBiggest(int[] array){
        int maxNumber = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i] > maxNumber){
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
    
    public static int[] removeBiggest(int[] array){
        int[] newArray = new int[array.length-1];
        int maxNumber = searchBiggest(array);
        int j=0;
        for(int i=0; i<array.length; i++){
            if(array[i] != maxNumber){
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }
}
