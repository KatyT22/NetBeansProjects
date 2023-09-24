/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.encapsulation;

/**
 *
 * @author katy
 */
public class Player {
    private String name;
    private int health = 100;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        if((health > 0) && (health <= 100)){
            this.health = health;
        }
        this.weapon = weapon;
    }
    
    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
        }
    }
    
    public int getHitPoints(){
        return this.health;
    }
}
