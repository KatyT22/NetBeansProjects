/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.scopes;

import java.io.Serializable;

/**
 *
 * @author katy
 */

public class DependentScope implements Serializable{
    public String getHashCode(){
        return this.hashCode() + " ";
    }
    
}
