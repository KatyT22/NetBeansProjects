/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.polymorphism;

/**
 *
 * @author katy
 */
public class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable");
    }
    
    //No plot method

    @Override
    public int getId() {
        return 5;
    }
    
    
}
