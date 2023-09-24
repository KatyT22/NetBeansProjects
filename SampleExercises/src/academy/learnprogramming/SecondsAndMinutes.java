/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class SecondsAndMinutes {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static String getDurationString(int minutes, int seconds){
        if((minutes < 0) || ((seconds < 0) || (seconds > 59))){
            return INVALID_VALUE_MESSAGE;
        }else{
            int hours = (int) minutes / 60;
            int remainingMinutes = minutes % 60;
            String hoursString = hours + "h";
            String minutesString = remainingMinutes + "m";
            String secondsString = seconds + "s";
            
            if(hours < 10){
                hoursString = "0" + hoursString;
            }
            
            if(remainingMinutes < 10){
                minutesString = "0" + minutesString;
            }
            
            if(seconds < 10){
                secondsString = "0" + secondsString;
            }
            return (hoursString+" "+minutesString+" "+secondsString);
        }
    }
    
    public static String getDurationString(int seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }else {
            int minutes = (int) (seconds / 60);
            int remainingSeconds = (seconds % 60);
            return getDurationString(minutes, remainingSeconds);
        }
    }
    
}
