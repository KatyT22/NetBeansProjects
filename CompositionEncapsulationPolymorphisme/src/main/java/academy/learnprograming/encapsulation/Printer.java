/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.encapsulation;

/**
 *
 * @author katy
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if((tonerLevel >=0) && (tonerLevel <= 100)){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
            System.out.println("Toner level haven't been set correctly");
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }
        
    public int addToner(int tonerAmount){
        if(this.tonerLevel == -1){
            this.tonerLevel = 0;
        }
        
        if((tonerAmount > 0) && (tonerAmount <= 100)){
            if((tonerAmount + this.tonerLevel)>100){
                System.out.println("Toner level haven't been set correctly");
                return -1;
            }else{
                System.out.println("Filling toner with "+tonerAmount+"%");
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        }else{
            System.out.println("Toner level haven't been set correctly");
            return -1;
        }
    }
    
    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint = (pages/2) + (pages%2);
            System.out.println("Printing in duplex mode");
        }else{
            System.out.println("Printing ");
        }
        //this.tonerLevel-=pages;
        this.pagesPrinted+=pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
    
    
}
