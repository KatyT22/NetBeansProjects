/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.constructors;

/**
 *
 * @author katy
 */
public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double distance(){
        return distance(0, 0);
    }
    
    public double distance(int x, int y){
        return Math.sqrt((x-this.x) * (x-this.x) + (y-this.y) * (y-this.y));
    }
    
    public double distance(Point another){
        return distance(another.x, another.y);
    }
}
