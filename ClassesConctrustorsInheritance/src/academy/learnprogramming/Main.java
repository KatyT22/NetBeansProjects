/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

import academy.learnprogramming.constructors.ComplexNumber;
import academy.learnprogramming.classes.SimpleCalculator;
import academy.learnprogramming.constructors.Wall;
import academy.learnprogramming.constructors.Point;
import academy.learnprogramming.constructors.VipCustomer;
import academy.learnprogramming.constructors.exercises.Carpet;
import academy.learnprogramming.constructors.exercises.Calculator;
import academy.learnprogramming.constructors.exercises.Floor;
import academy.learnprogramming.constructors.Account;
import academy.learnprogramming.classes.Person;
import academy.learnprogramming.classes.Car;
import academy.learnprogramming.inheritance.Animal;
import academy.learnprogramming.inheritance.Dog;
import academy.learnprogramming.inheritance.Twingo;

/**
 *
 * @author katy
 */
public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
       
        porsche.setModel("911");
        System.out.println("Model is "+porsche.getModel());
        
        
        
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(2);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(2);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    
        System.out.println("________________");
    
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

        System.out.println("________________");
        Account myAccount = new Account();
        System.out.println("________________");
        myAccount.setNumber("456852");
        myAccount.setCustomerFirstName("Katy");
       
        System.out.println("Account number = "+myAccount.getNumber());
        System.out.println("Account owner name = "+myAccount.getCustomerFirstName());
        System.out.println("Account owner name = "+myAccount.getCustomerLastName());
        System.out.println("________________");
        myAccount.withdrawFunds(90);
        myAccount.depositFunds(100);
        myAccount.withdrawFunds(110);
        myAccount.withdrawFunds(102.5);
        
        System.out.println("________________");
        Account timsAccount = new Account();
        Account bobsAccount = new Account("Bob", "Finler", "bob.finler@company.com", "(+33) 01 25 45 85 98");
        timsAccount.printAccountInfo();
        bobsAccount.printAccountInfo();
        
        System.out.println("________________");
        VipCustomer defaultcustomer = new VipCustomer();
        VipCustomer customerWith2info = new VipCustomer("Bob", "bob@emailAddress.com");
        VipCustomer customerWithAllInfo = new VipCustomer("Tim", 25000, "tim@emailAddress.com");
        defaultcustomer.printVipCustomerInfo();
        customerWith2info.printVipCustomerInfo();
        customerWithAllInfo.printVipCustomerInfo();
        System.out.println("________________");
        Wall wall2 = new Wall();
        System.out.println("width= " + wall2.getWidth());
        Wall wall = new Wall(1.125,-1.0);
        System.out.println("area= " + wall.getArea());
 
        //wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
        
        System.out.println("________________");
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
        
        System.out.println("________________");
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator2 = new Calculator(floor, carpet);
        System.out.println("total= " + calculator2.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator2 = new Calculator(floor, carpet);
        System.out.println("total= " + calculator2.getTotalCost());
        
        System.out.println("________________");
        
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
        System.out.println("________________");
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        //dog.eat();
        dog.walk();
        dog.run();
        System.out.println("________________");
        Twingo myTwingo = new Twingo(36);
        myTwingo.accelerate(10);
      
        myTwingo.steer(45);
        myTwingo.accelerate(12);
        myTwingo.accelerate(30);
        myTwingo.steer(-45);
        myTwingo.accelerate(-40);
        System.out.println("________________");
        myTwingo.printInfo();
        
        System.out.println("________________");
               
    }
}
