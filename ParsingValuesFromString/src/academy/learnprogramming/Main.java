/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class Main {
    public static void main(String[] args) {
        String numberAsString = "2022.5";
        System.out.println("numberAsString = " + numberAsString);
        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);
        
        numberAsString +=1;
        number +=1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
        
        System.out.println("can Pack -> + "+FlourPack.canPack(2, 1, 5));
        System.out.println("can Pack -> + "+FlourPack.canPack(2, 10, 18));
        System.out.println("can Pack -> + "+FlourPack.canPack(2, 2, 11));
        System.out.println("can Pack -> - "+FlourPack.canPack(2, 0, 9));
        System.out.println("can Pack -> + "+FlourPack.canPack(0, 10, 8));
        System.out.println("can Pack -> + "+FlourPack.canPack(2, 5, 6));
        System.out.println("can Pack -> - "+FlourPack.canPack(5, 3, 24));
        System.out.println("_________________________");
        System.out.println("getLargestPrime -> "+LargestPrime.getLargestPrime(45));
        System.out.println("_________________________");
        DiagonalStar.printSquareStar(5);
        
        System.out.println("_________________________");
        //ReadingUserInput.userInput();
        System.out.println("_________________________");
        ReadingUserInputChallenge.sumNumbers(0);
        System.out.println("_________________________");
        //ReadingUserInputChallenge.minMaxNumber();
        System.out.println("_________________________");
        //InputCalculator.inputThenPrintSumAndAverage();
        System.out.println("_________________________");
        System.out.println(""+PaintJob.getBucketCount(3.4, 1.5));
    }
}
