/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }
        /*if(number == 2){
            return 2;
        }*/

        //int index = 2;
        int divisor = 2;
        //int dividende;
        int remainder;
        
        int count = 0;
        
        int primeNumber = -1;
        while(divisor <= number){
            remainder = number % divisor;
            //dividende = number / divisor;
            if(remainder == 0){
                System.out.println("divisor -> "+divisor);
                for(int i=2; i<=(Math.sqrt(divisor)); i++){
                    if((divisor % i) == 0){
                          count++;
                    }
                }
                if(count < 1){
                    primeNumber = divisor;
                    System.out.println(primeNumber + " is prime number");
                    count=0;
                    //return primeNumber; 
                }
  
            }
            divisor++;
        }

        return primeNumber;
    }
    
    public static boolean isPrimeNumber(int number){
        if(number <= 1){
            return false;
        }
        
        int index = 2;
        while(index <= (number/2)){
            if(number % index == 0){
                return false;
            }
            index ++;
        }
        return true;
    }
}
