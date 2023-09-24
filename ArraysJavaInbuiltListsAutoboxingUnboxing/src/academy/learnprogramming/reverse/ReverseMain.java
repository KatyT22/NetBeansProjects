/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.reverse;

import java.util.Arrays;

/**
 *
 * @author katy
 */
public class ReverseMain {
    public static void main(String[] args) {
        int[] originalArray = new int[] {1, 5, 3, 7, 11, 9, 15, 8, 9, 10};
        System.out.println("Before: "+Arrays.toString(originalArray));
        reverse(originalArray);
        System.out.println("After: "+Arrays.toString(originalArray));
    }
    
    public static void reverse(int[] array){
        int temp;
        for(int i=0; i<array.length/2; i++){
            System.out.println(+array[array.length-(i+1)]+" swaped with "+array[i]);
            temp = array[i];
            array[i] = array[array.length-(i+1)];
            array[array.length-(i+1)] = temp;
        }
    }
}
