/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class EvenNumber {
    public static boolean isEvenNumber(int number){
        return ((number % 2) == 0);
    }
    
   public static void printNumbers(){
       System.out.println("1______________________________");
        int count = 1;
        while(count < 6){
            System.out.println("Count value is "+ count);
            count ++;
        }
        
        System.out.println("2______________________________");
        
        for(count =1; count <6; count ++){
            System.out.println("Count value is "+ count);
        }
        
        System.out.println("3______________________________");
        
        count =1;
        while(true){
            if(count == 6){
                break;
            }
            System.out.println("Count value is "+ count);
            count ++;
        }
        
        System.out.println("4______________________________");
        
        count =1;
        do{
            System.out.println("Count value is "+ count);
            count ++;
        }while(count < 6);
         
        System.out.println("5______________________________");
        
        int number = 4;
        int finishNumber = 20;
        count = 0;
        
        while(number <= finishNumber){
            
            /*if(EvenNumber.isEvenNumber(number)){
                System.out.println("Even number " + number);
            }
            number ++;*/
            
            number ++;
            if(!EvenNumber.isEvenNumber(number)){
                continue;
            }
            count++;
            System.out.println("Even number " + number);
            if(count >= 5){
                break;
            }
        }
        System.out.println("Even number count = "+count);
   }
 
}
