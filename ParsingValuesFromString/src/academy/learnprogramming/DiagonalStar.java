/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class DiagonalStar {
    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println(INVALID_VALUE_MESSAGE);
        }else{
            int indexRow = 0;
            int indexColumn = 0;
            while(indexRow < number){
                
                while(indexColumn < number){

                    if((indexRow == 0) || (indexRow == (number-1))){
                        System.out.print("*");

                        //System.out.println(indexRow);
                    }else if((indexColumn == 0) || (indexColumn == (number-1))){
                        System.out.print("*");
                    }else if(indexColumn == indexRow){
                        System.out.print("*");
                    }else if(indexColumn == ((number-1) - indexRow)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }

                    indexColumn++;
                }
                System.out.println("");
                indexColumn = 0;
                indexRow++;
            }
        }
    }
}
