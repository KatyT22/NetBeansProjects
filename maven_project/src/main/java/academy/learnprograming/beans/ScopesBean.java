/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.beans;

import academy.learnprograming.scopes.ApplicationScope;
import academy.learnprograming.scopes.DependentScope;
import academy.learnprograming.scopes.RequestScope;
import academy.learnprograming.scopes.SessionScope;
import academy.learnprograming.sessionbeans.AuditedService;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

/**
 *
 * @author katy
 */


public class ScopesBean implements Serializable {
    //Field injection point
    @Inject
    private RequestScope requestScope;
    
    @Inject
    private ApplicationScope applicationScope;
    
    @Inject
    private AuditedService auditedService;
    
    

    
    
    //Constructor injection point
    @Inject
    private ScopesBean(DependentScope dependentScope){
        this.dependentScope = dependentScope;
    }
    
    //Method injection point
    @Inject
    private void setSessionScope(SessionScope sessionScope){
        this.sessionScope = sessionScope;
    }
    
    //Producer object
    @Inject
    private Logger logger;
    
    
    private SessionScope sessionScope;
    
    private DependentScope dependentScope;
 
    
    //Lifecycle callback
    @PostConstruct
    private void init(){
        auditedService.auditedMethod();
        logger.log(Level.INFO, "**********************************");
        logger.log(Level.INFO, "Scopes bean called");
        logger.log(Level.INFO, "**********************************");
    }
    
    @PreDestroy
    private void kill(){
        logger.log(Level.INFO, "**********************************");
        logger.log(Level.INFO, "Scopes bean going to be killed :-(");
        logger.log(Level.INFO, "**********************************");
    }
    
    
}
