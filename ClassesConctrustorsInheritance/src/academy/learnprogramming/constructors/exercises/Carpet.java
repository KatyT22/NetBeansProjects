/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.constructors.exercises;

/**
 *
 * @author katy
 */
public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = cost;
        if(cost < 0){
            this.cost = 0;
        }
    }

    public double getCost() {
        return cost;
    }
}
