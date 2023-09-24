/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class Digits {

    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
               
        int sumDigit = 0;
       
        while(number > 0){

            int unitDigit = number % 10;
            sumDigit += unitDigit;
            number = number / 10;
           
            System.out.println("newNumber = "+number);
            System.out.println("unitDigit = "+unitDigit);
            System.out.println("________________________");

        }
        //System.out.println(" sumDigit = "+sumDigit);
        return sumDigit;
        
    }
}
