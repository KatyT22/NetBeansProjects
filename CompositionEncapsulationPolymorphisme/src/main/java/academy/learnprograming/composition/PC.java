/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.composition;

/**
 *
 * @author katy
 */
public class PC {
    private Case pcCase;
    private Monitor pcMonitor;
    private Motherboard pcMotherboard;

    public PC(Case pcCase, Monitor pcMonitor, Motherboard pcMotherboard) {
        this.pcCase = pcCase;
        this.pcMonitor = pcMonitor;
        this.pcMotherboard = pcMotherboard;
    }

    public void powerUp(){
        pcCase.pressPowerButton();
        drawLogo();
        loading();
    }
    
    private void drawLogo(){
        //Fancy graphics
        pcMonitor.drawPixelAt(1200, 50, "yellow");
    }
    
    public void loading(){
        pcMotherboard.loadProgram("Windows 1.0");
    }
    
   
    
    
    
}
