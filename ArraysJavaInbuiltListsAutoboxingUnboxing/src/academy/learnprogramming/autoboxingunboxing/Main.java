/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.autoboxingunboxing;

import java.util.ArrayList;

/**
 *
 * @author katy
 */

//wrapper for int value
class IntClass{
    private int myValue;
    
    public IntClass(int myValue){
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    } 
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];
        
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
 
        Integer integerValue = 54; //Integer.valueOf(54) <- at compile time
        int intValue = integerValue; //integerValue.intValue() <- at compile time
        
        Integer integer = new Integer(54);
        Double doubleValue = new Double(5.4);
        //Auto boxing
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++){
            intArrayList.add(Integer.valueOf(i));
        }
        
        for(int i=0; i<intArrayList.size(); i++){
            System.out.println(i+" --> "+intArrayList.get(i).intValue());
        }
        
        Integer myIntValue = 56;
        
        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        for(double i=0.0; i<=10.0; i+=0.5){
            doubleArrayList.add(i);
        }
        
        for(int i=0; i<doubleArrayList.size(); i++){
            System.out.println(i+" --> "+doubleArrayList.get(i));
        }
        
    }
}
