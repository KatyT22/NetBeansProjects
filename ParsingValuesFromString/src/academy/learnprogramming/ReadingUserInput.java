/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

import java.util.Scanner;

/**
 *
 * @author katy
 */
public class ReadingUserInput {
    public static final String INVALID_YEAR_OF_BIRTH_MESSAGE = "Invalid year of birth";
    public static void userInput(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your year of birth : ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();//to handle next input("enter" key is automatically counting for next input)
        
            System.out.println("Enter you name : ");
            String name = scanner.nextLine();
        
            int age = 2022 - yearOfBirth;
            
            if((age >= 0) && (age < 120)){
                System.out.println("Your name is "+name+" and you are "+age+" years old.");
            }else{
                System.out.println(INVALID_YEAR_OF_BIRTH_MESSAGE);
            }
        }else{
            System.out.println(INVALID_YEAR_OF_BIRTH_MESSAGE);
        }
        
        scanner.close();
        
    }
}
