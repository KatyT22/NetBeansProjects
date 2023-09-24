/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class MegaBytesConverter {
    
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            
            int megaBytes = (int)(kiloBytes / 1024);
            int remainingKilobytes = (kiloBytes % 1024);
            System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+remainingKilobytes+" KB");
        }
    }
    
    
    
}
