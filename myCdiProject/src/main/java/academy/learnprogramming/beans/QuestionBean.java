/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.beans;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author katy
 */
@RequestScoped
public class QuestionBean implements Serializable{
    
    
    final String question = "How do you like javaEE ?";
    
    
    final Long questionId = Long.MIN_VALUE;
    
    
    
     private static final long serialVersionUID = 440804699990999L;

    public String getHashCode() {
        return this.hashCode() + " "+this.getQuestionId()+": "+this.getQuestion();
    }
    
    
    public String getQuestion(){
        return this.question;
    }
    
    public Long getQuestionId(){
        return this.questionId;
    }
    
}
