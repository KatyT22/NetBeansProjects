/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author katy
 */
public class MoyennePrixActions {
    
   //public static float [] 
    
    public static String[] cours(String [] companies, float [][] prices){
        
        Map <String, Float> map = new HashMap<String, Float>();
        Map.Entry<String, Float> maxEntry = null;
        String [] maxCompanies = new String [3];
        
        float moyenne = 0f;
  
        
        for(int i = 0; i<prices.length; i++){
            for(int j = 0; j<prices.length; j++){
                moyenne += (prices[j][i])/prices.length;
            }
            map.put(companies[i], moyenne);
            
        }

        for(Map.Entry<String, Float> entry : map.entrySet()){
            if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0){
                maxEntry = entry;
                
            }
        }
        
        // remove max
        maxCompanies[0] = maxEntry.getKey();
        map.remove(maxCompanies[0]);
        
        maxEntry = null;
        
        for(Map.Entry<String, Float> entry : map.entrySet()){
            if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0){
                maxEntry = entry;
                
            }
        }
        
        // remove max
        maxCompanies[1] = maxEntry.getKey();
        map.remove(maxCompanies[1]);
        
        maxEntry = null;
        
        for(Map.Entry<String, Float> entry : map.entrySet()){
            if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0){
                maxEntry = entry;
                
            }
        }
        
        // remove max
        maxCompanies[2] = maxEntry.getKey();
        map.remove(maxCompanies[2]);
        
        Arrays.sort(maxCompanies);
        
        return maxCompanies;
    }
}
