/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.polymorphism;

/**
 *
 * @author katy
 */
public class IndependanceDay extends Movie{

    public IndependanceDay() {
        super("Independance day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth.";
    }

    @Override
    public int getId() {
        return 2; 
    }
    
    
}