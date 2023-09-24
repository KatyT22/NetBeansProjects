/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class ForStatement {
    
    public static final String INVALID_NUMBER = "Invalid Number";
    
    public static double calculateInterest(double amount, double interestRate){
        return ((amount*interestRate)/100);
    }
    
    public static void calculateInterest(int begin, int end){
        for(int i=begin; i<=end; i++){
            System.out.println("10,000 at "+i+"% interest = "+String.format("#%,.3f", calculateInterest(100000d, (double)i)));
        }
        System.out.println("°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*°*");
        for(int i=end; i>=begin; i--){
            System.out.println("5,000 at "+i+"% interest = "+String.format("%.2f", calculateInterest(5000d, (double)i)));
        }
    }
    
    public static boolean isPrime(int n){
        if( n == 1){
            return false;
        }
        for(int i=2; i<=(long) Math.sqrt(n); i++){
            System.out.println(i);
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void countPrimeNumbers(int beginRange, int endRange){
        int primeNumbersFound = 0;
        for(int i = beginRange; i<=endRange; i++){
            
            if(isPrime(i)){
                System.out.println("Prime number = "+i);
                primeNumbersFound++;
                if(primeNumbersFound == 10){
                    System.out.println("Exiting loop !");
                    break;
                }
            }
        }
        System.out.println(primeNumbersFound+" Prime numbers found.");
    }
    
    public static void sum3and5(int end){
        long sum = 0;
        int numbersFound = 0;
        if(end > 1000){
            System.out.println(INVALID_NUMBER);
        }else{
            for(int i=1; i<=1000; i++){
                if((i % 3 == 0) && (i % 5 == 0)){
                    sum +=i;
                    System.out.println("sum3and5 -> "+i);
                    numbersFound ++;
                    if(numbersFound == 5){
                        break;
                    }
                }
            }
            System.out.println("Sum is " + sum);
        } 
    }
    
    public static boolean isOdd(int number){
        
        return ((number > 0) && ((number % 2) != 0));
       
    }
    
    public static int sumOdd(int start, int end){
        long sum = 0;
        if((start <= 0) || (end < 0) || (end < start)){
            return -1;
        }else{
            
            for(int i=start; i<=end; i++){
                if(isOdd(i)){
                    sum+=i;
                }
            }
        }
        return (int)sum;
    }
    
}
