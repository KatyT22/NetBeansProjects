/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package academy.learnprograming.main;

import academy.learnprograming.composition.Case;
import academy.learnprograming.composition.Dimensions;
import academy.learnprograming.composition.Monitor;
import academy.learnprograming.composition.Motherboard;
import academy.learnprograming.composition.PC;
import academy.learnprograming.composition.Resolution;
import academy.learnprograming.composition.excercise.Ceiling;
import academy.learnprograming.composition.excercise.Lamp;
import academy.learnprograming.composition.excercise.Bed;
import academy.learnprograming.composition.excercise.Bedroom;
import academy.learnprograming.composition.excercise.Wall;
import academy.learnprograming.composition.roomComposition.Bed_;
import academy.learnprograming.composition.roomComposition.BedBase;
import academy.learnprograming.composition.roomComposition.BedFrame;
import academy.learnprograming.composition.roomComposition.BedsideTable;
import academy.learnprograming.composition.roomComposition.Bureau;
import academy.learnprograming.composition.roomComposition.Cupboard;
import academy.learnprograming.composition.roomComposition.Mattress;
import academy.learnprograming.composition.roomComposition.Room;
import academy.learnprograming.encapsulation.Player;
import academy.learnprograming.encapsulation.Printer;
import academy.learnprograming.polymorphism.Forgetable;
import academy.learnprograming.polymorphism.IndependanceDay;
import academy.learnprograming.polymorphism.Jaws;
import academy.learnprograming.polymorphism.MazeRunner;
import academy.learnprograming.polymorphism.Movie;
import academy.learnprograming.polymorphism.StarWars;
import java.util.Random;

/**
 *
 * @author katy
 */
public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case pcCase = new Case("220B", "Dell", "240", dimensions);
        Monitor pcMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard pcMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        PC pc1 = new PC(pcCase, pcMonitor, pcMotherboard);
        pc1.powerUp();
        
        System.out.println("_________Composition____________");
        
        Dimensions mattressDim = new Dimensions(190, 30, 200);
        Dimensions bedframeDim = new Dimensions(190, 50, 200);
        Dimensions bedbaseDim = new Dimensions(190, 2, 200);
        Dimensions cupboardDim = new Dimensions(190, 250, 70);
        Dimensions bureauDim = new Dimensions(130, 100, 90);
        Dimensions roomDim = new Dimensions(700, 300, 700);
        Dimensions bedsidetableDim = new Dimensions(40, 50, 40);
        Mattress mattress = new Mattress("Nature Bio", mattressDim);
        BedFrame bedframe = new BedFrame("Camif", bedframeDim);
        BedBase bedbase = new BedBase("Camif", bedbaseDim);
        Bed_ bed_ = new Bed_(mattress, bedframe, bedbase);
        Cupboard cupboard = new Cupboard("Conforama", cupboardDim, 3, 2, 1);
        Bureau bureau = new Bureau("Maison du monde", bureauDim, 0);
        BedsideTable bedsidetable = new BedsideTable("Fait main", bedsidetableDim, 1);
        Room myRoom = new Room("myRoom", bed_, cupboard, bureau, bedsidetable, 2, roomDim);

        System.out.println("What is in my room ?");
        myRoom.listAllElements();
        myRoom.makeBed();
        
        System.out.println("_________Composition____________");
        
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();
        System.out.println("_______Encapsulation______________");
        Player player = new Player("Tim", 500, "Sword");
        System.out.println("Initial health is "+player.getHitPoints());
        player.loseHealth(10);
        System.out.println("Remaining health "+player.getHitPoints());
        player.loseHealth(11);
        System.out.println("Remaining health "+player.getHitPoints());
        System.out.println("________Encapsulation_____________");
        Printer printer = new Printer(90, true);
        printer.addToner(15);
        printer.printPages(60);
        System.out.println("Pages printed = "+printer.getPagesPrinted());
        System.out.println("Toner level = "+printer.getTonerLevel()+"%");
        printer.addToner(2);
        printer.printPages(5);
        System.out.println("Pages printed = "+printer.getPagesPrinted());
        System.out.println("Toner level = "+printer.getTonerLevel()+"%");
        
        System.out.println("________Polymorphism_____________");
        for(int i=1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println(i+" -> Movie #"+movie.getId()+": "+
                    movie.getName()+"\n"+
                    "Plot: "+movie.plot()+"\n");
        }
    }
    
    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was : "+randomNumber);
        
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependanceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    } 
}
