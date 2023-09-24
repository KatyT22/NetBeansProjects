/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprograming.polymorphism.exercise;


/**
 *
 * @author katy
 */
public class MainCar {
    public static void main(String[] args) {
        for(int i=1; i<6; i++){
            Car car = randomCar();
            System.out.println(i+"-> Car name: "+car.getName()+"\n"
                            +car.startEngine()+"\n"
                            +car.accelerate()+"\n"
                            +car.brake()+"\n");
        }
        
    }
    
    public static Car randomCar(){
        int random = (int)(Math.random()*3)+1;
        switch (random) {
            case 1:
                return new Peugeot();
            case 2:
                return new Renault();
            case 3:
                return new Citroen();
            default:
                return null;
        }
    }
}

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    
    public String startEngine(){
        return "Starting.";
    }
    
    public String accelerate(){
        return "Accelerating ...";
    }
    
    public String brake(){
        return "Braking !";
    }
}

class Peugeot extends Car{

    public Peugeot() {
        super(4, "Peugeot 1007 Turbo");
    }

    @Override
    public String brake() {
        return "Ça freine fort avec le turbo !";
    }

    @Override
    public String accelerate() {
        return "Attachez vos ceintures, c'est une turbo !";
    } 
}

class Renault extends Car{

    public Renault() {
        super(3, "Kangoo");
    }


    @Override
    public String accelerate() {
        return "Douce acceleration pour la Kangoo.";
    }

}

class Citroen extends Car{

    public Citroen() {
        super(2, "Coccinelle");
    }

    @Override
    public String brake() {
        return "Elle se pose en douceur.";
    }

    @Override
    public String accelerate() {
        return "Une impression de voler comme une coccinelle.";
    }

}