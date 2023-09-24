/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.scopes;

import javax.enterprise.context.RequestScoped;

/**
 *
 * @author katy
 */
@RequestScoped
public class RequestScope {
    
    public String getHashCode(){
        return this.hashCode() + " ";
    }
}
