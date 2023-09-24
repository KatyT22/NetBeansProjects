/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.entity;

import java.time.LocalDate;
import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * Classe de démarrage de l'application
 * @author katy
 * @version 0.1
 */


@Entity
public class Todo{
    //TODO Afficher "Hello world"
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotEmpty(message = "Task must be set")
    @Size(min = 10, message = "Size should not be less then 10 characters")
    private String task;
    
    @NotNull(message = "Date must be set")
    @FutureOrPresent(message = "Due date must be in the present or future")
    @JsonbDateFormat(value = "yyyy-MM-dd")
    private LocalDate dueDate;
    
    
    private boolean isCompleted;
    private LocalDate dateCompleted;
    private LocalDate dateCreated;
    
    @PrePersist
    private void init(){
        setDateCreated(LocalDate.now());
    }

    /**
     * Get the value of dateCreated
     *
     * @return the value of dateCreated
     */
    public LocalDate getDateCreated() {
        return dateCreated;
    }

    /**
     * Set the value of dateCreated
     *
     * @param dateCreated new value of dateCreated
     */
    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Get the value of dateCompleted
     *
     * @return the value of dateCompleted
     */
    public LocalDate getDateCompleted() {
        return dateCompleted;
    }

    /**
     * Set the value of dateCompleted
     *
     * @param dateCompleted new value of dateCompleted
     */
    public void setDateCompleted(LocalDate dateCompleted) {
        this.dateCompleted = dateCompleted;
    }


    /**
     * Get the value of isCompleted
     *
     * @return the value of isCompleted
     */
    public boolean isIsCompleted() {
        return isCompleted;
    }

    /**
     * Set the value of isCompleted
     *
     * @param isCompleted new value of isCompleted
     */
    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }


    /**
     * Get the value of dueDate
     *
     * @return the value of dueDate
     */
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * Set the value of dueDate
     *
     * @param dueDate new value of dueDate
     */
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Get the value of task
     *
     * @return the value of task
     */
    public String getTask() {
        return task;
    }

    /**
     * Set the value of task
     *
     * @param task new value of task
     */
    public void setTask(String task) {
        this.task = task;
    }


    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(Long id) {
        this.id = id;
    }
}