/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrainement.programmation;

import java.util.HashSet;

/**
 *
 * @author katy
 */
public class NombreSpecial {
    
    public static boolean IsSpecialNumber(int n){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int reste;
        while(n > 0){
            reste = n%10;
            System.out.println("reste : "+reste);
            n = (n-reste)/10;
            System.out.println("Nouvean nombre : "+n);
            hashSet.add(reste);
        }
        System.out.println("Contenu du HashSet : " +hashSet.toString());
        return (hashSet.size() > 2?false:true);
        
    }
    
}
