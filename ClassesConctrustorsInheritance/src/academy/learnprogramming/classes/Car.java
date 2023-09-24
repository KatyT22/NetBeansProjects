/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.classes;

/**
 *
 * @author katy
 */
public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;
    
    
    
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }
    
    public String getModel(){
        return this.model;
    }
    
    public void setDoors(int doors){
        this.doors = doors;
    }
    
}
