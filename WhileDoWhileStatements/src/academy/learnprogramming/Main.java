/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //EvenNumber.printNumbers();
        
        System.out.println("sumDigits -> "+Digits.sumDigits(125));
        
        System.out.println("isPalindrome "+NumberPalindrome.isPalindrome(11));
        System.out.println("________________________");
        System.out.println("sumFirstAndLastDigit "+FirstLastDigitSum.sumFirstAndLastDigit(-10));
        System.out.println("getEvenDigitSum " + EvenDigitSum.getEvenDigitSum(-22));
        System.out.println("hasSharedDigit -> "+SharedDigit.hasSharedDigit(21, 22));
        System.out.println("hasSameLastDigit -> "+LastDigitChecker.hasSameLastDigit(23, 32, 42));
        System.out.println("________________________");
        System.out.println("getGreatestCommonDivisor -> "+GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
        FactorPrinter.printFactors(10);
        System.out.println("________________________");
        System.out.println("isPerfectNumber -> "+PerfectNumber.isPerfectNumber(-1));
        System.out.println("________________________");
        NumberToWords.numberToWords(100);
        System.out.println("reverse -> "+NumberToWords.reverse(100));
        System.out.println("getDigitcount -> "+NumberToWords.getDigitCount(100));
  
    }
    
}
