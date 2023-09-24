/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrainement.programmation;


/**
 *
 * @author katy
 */
public class Ascii {
    
    public Ascii() {
    }
    
    public static char reverseAsciiChart(String s){
        
        for(char i='A'; i<'Z'; i++){
            if(A.scanChar(i).equals(s)){  
                return i;
            }
        }
        return '?';
    }
    
    public static void main(String[] args){
        System.out.println("Ascii Art -> "+A.scanChar('B')+A.scanChar('Y')+A.scanChar('E'));
        System.out.println(" Transform -> "+Ascii.reverseAsciiChart(A.scanChar('B')));
        System.out.println(" Transform -> "+Ascii.reverseAsciiChart(A.scanChar('Y')));
        System.out.println(" Transform -> "+Ascii.reverseAsciiChart(A.scanChar('E')));
        
        char myUnicode = '\u00A9';
        System.out.println("Unicode = "+myUnicode);
    }
    
}
