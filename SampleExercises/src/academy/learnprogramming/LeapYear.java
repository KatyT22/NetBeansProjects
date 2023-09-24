/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class LeapYear {
    public enum Step{ONE, TWO, THREE, FOUR, FIVE
    }
    
    public static Step step = Step.ONE;
    
    public static boolean isLeapYear(int year){
        boolean isLeap = false;
        if(year >=1 && year <= 9999){
            while(step != Step.FOUR && step != Step.FIVE){
                switch(step){
                        case ONE:
                            if(year % 4 == 0){
                                step = Step.TWO;
                            }else{
                                step = Step.FIVE;
                            }
                            break;
                        case TWO:
                            if(year % 100 == 0){
                                step = Step.THREE;
                            }else{
                                step = Step.FOUR;
                                isLeap = true;
                            }
                            break;
                        case THREE:
                            if(year % 400 == 0){
                                step = Step.FOUR;
                                isLeap = true;
                            }else{
                                step = Step.FIVE;
                            }
                            break;
                }
            }
        }
                
        return isLeap;
            
    }
    
    public static boolean isLeapYear2(int year) {
            return ((year >= 1) && (year <= 9999)) && ((year % 4 == 0) && ((year % 100 == 0)&&(year % 400 == 0) || (year % 100 != 0)));
        }
    
}
