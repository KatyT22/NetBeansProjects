/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int a, int b){
        if((a < 10) || (b < 10)){
            return -1;
        }
        
        int commonDivisor = -1;
        
        int index = 1;
        
        while(index <= (a<b?a:b)){
            System.out.println("index -> "+index);
            if((a % index == 0) && (b % index == 0)){
                commonDivisor = index;
                System.out.println(index+" is a common divisor");
            }
            index ++;
        }
        
        return commonDivisor;
    }
}
