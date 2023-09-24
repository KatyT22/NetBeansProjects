/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.composition.roomComposition;

/**
 *
 * @author katy
 */
public class Wall {
    private String direction;
    private String paintedColor;
    private int height;

    public Wall(String direction, String paintedColor, int height) {
        this.direction = direction;
        this.paintedColor = paintedColor;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    
    public String getPaintedColor() {
        return paintedColor;
    }

    public String getDirection() {
        return direction;
    }
    
    
}
