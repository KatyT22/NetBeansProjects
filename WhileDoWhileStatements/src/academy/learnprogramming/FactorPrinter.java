/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class FactorPrinter {
    
    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void printFactors(int number)
    {
        
        if(number < 1){
            System.out.println(INVALID_VALUE_MESSAGE);
        }
        else{
            
            int index = 1;
            while(index <= number){
                
                if((number % index) == 0){
                    System.out.println(index);
                    
                }
                index ++;
            }
        }
        
    }
}
