/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.scopes;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
/**
 *
 * @author katy
 */


@ApplicationScoped
public class ApplicationScope implements Serializable {

    private static final long serialVersionUID = 27080464521478L;

    public String getHashCode() {
        return this.hashCode() + " ";
    }
}