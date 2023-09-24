/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class TeenNumberChecker {
    public static boolean isTeen(int num){
        return (num >= 13 && num <= 19);
    }
    public static boolean hasTeen(int num1, int num2, int num3){
        return (isTeen(num1) || isTeen(num2) || isTeen(num3));
    }
}
