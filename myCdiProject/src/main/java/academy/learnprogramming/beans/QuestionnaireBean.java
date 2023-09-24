/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.beans;

import academy.learnprogramming.annotations.Web;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;


/**
 *
 * @author katy
 */
@Web
public class QuestionnaireBean {

    
    private QuestionBean questionBean;
    
  
    private Long questionnaireId;
    
   
    private int questionNumber;
    
    @Inject
    private Logger logger;
    
    
    private QuestionnaireBean(QuestionBean questionBean, Long questionnaireId, int questionNumber){
       this.questionBean = questionBean;
       this.questionNumber = questionNumber;
       this.questionnaireId = questionnaireId;
    } 
    
    
    @PostConstruct
    private void init(){
        logger.log(Level.INFO, "********************QuestionnaireBean is being initialized :-)***************************");
    }
    
    @PreDestroy
    private void kill(){
        logger.log(Level.INFO, "***********************QuestionnaireBean is being killed :-(********************************");
    }
    
    public QuestionBean getQuestionBean(){
        return this.questionBean;
    }
    
    @Inject
    public void setQuestionBean(QuestionBean questionBean){
        this.questionBean = questionBean;
    }
    
    public Long getQuestionnaireId(){
        return this.questionnaireId;
    }
    
    public void setQuestion(Long questionnaireId){
        this.questionnaireId = questionnaireId;
    }
    
     public int getQuestionNumber(){
        return this.questionNumber;
    }
    
    public void setQuestion(int questionNumber){
        this.questionNumber = questionNumber;
    }
    
    public String displayQuestionnaire(){
        return questionBean.getHashCode();
    }
    
    
}
