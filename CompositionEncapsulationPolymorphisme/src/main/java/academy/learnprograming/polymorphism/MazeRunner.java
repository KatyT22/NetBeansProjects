/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.polymorphism;

/**
 *
 * @author katy
 */
public class MazeRunner extends Movie{

    public MazeRunner() {
        super("Maze runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }

    @Override
    public int getId() {
        return 3;
    }
    
    
}
