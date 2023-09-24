/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.polymorphism;

/**
 *
 * @author katy
 */
public class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    
    public String plot(){
        return "A shark eats lots of people.";
    }

    @Override
    public int getId() {
        return 1;
    }
    
    
}
