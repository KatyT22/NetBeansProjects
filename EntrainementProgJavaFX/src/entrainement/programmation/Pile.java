/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrainement.programmation;

import java.util.Stack;


/**
 *
 * @author katy
 */
public class Pile {
    
    public boolean Verify(String s){

        Stack<Character> maPile = new Stack<Character>();
        
        for(int i = 0; i<s.length(); i++)
        {
            switch (s.charAt(i)) {
                case ')':
                    if(maPile.peek() == '('){
                        maPile.pop();
                    }else
                        maPile.push(s.charAt(i));
                    break;
                case ']':
                    if(maPile.peek() == '['){
                        maPile.pop();
                    }else
                        maPile.push(s.charAt(i));
                    break;
                case '[':
                    maPile.push(s.charAt(i));
                    break;
                case '(':
                    maPile.push(s.charAt(i));
                    break;
                default:
                    //throw new AssertionError();  
            }
        }
        return maPile.empty();
    }
    
    
    public static void main(String [] args){
        
        String s="Sachin";
        
        Pile p = new Pile();
        System.out.println("result verify list -> "+p.Verify(""));
        System.out.println(s.concat(" Thineft"));
    } 
    
    
}
