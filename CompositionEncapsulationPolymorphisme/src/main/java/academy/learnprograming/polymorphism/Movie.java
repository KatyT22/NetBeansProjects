/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.polymorphism;

/**
 *
 * @author katy
 */
public class Movie {
    private String name;
    private int id;

    public Movie(String name) {
        this.name = name;
    }
    
    public String plot(){
        return "No plot here.";
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return -1;
    }
    
    
    
}

