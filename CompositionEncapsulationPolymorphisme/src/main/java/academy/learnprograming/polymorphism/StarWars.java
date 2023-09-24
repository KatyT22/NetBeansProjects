/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.polymorphism;

/**
 *
 * @author katy
 */
public class StarWars extends Movie{

    public StarWars() {
        super("Star wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }

    
    
    
}
