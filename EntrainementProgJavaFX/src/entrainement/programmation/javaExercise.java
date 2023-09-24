/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrainement.programmation;

import com.sun.deploy.util.ArrayUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.stream.IntStream;

/**
 *
 * @author katy
 */
public class javaExercise {
   //1. 
    public static int[] sortNumeric(int[] array){
        Arrays.sort(array);
        return array;
    }
    
    public static String[] sortString(String[] array){
        Arrays.sort(array);
        return array;
    }
    //2.
    public static int sum(int[] array){
        int result = 0;
        for(int i=0; i<array.length; i++){
            result += array[i];
        }
        return result;
    }
    //3.
    public static void printGrid(int [][]grid, char symbol){
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                //System.out.print(" "+symbol+" ");
                System.out.printf("%2d", grid[i][j]);
            }
            System.out.println("");
        }
    }
    
    //4.
    public static double average(int [] array){
        int result = 0;
        for(int i:array){
            result += i;
        }
        return (double)result/array.length;
    }
    
    //5.
    public static boolean hasValue(int[] array, int num){
        
        int index = Arrays.binarySearch(array, num);
        return (index<0?false:true);
        
    }
    public static boolean hasValue2(int[] array, int num){
        
        for(int i:array){
            if(i == num){
                return true;
            }
        }
        return false;
    }
    
    //6.
    public static int getIndex(int [] array, int num){
        for(int i=0; i<array.length; i++){
            if(array[i] == num){
                return i;
            }
        }
        return -1;
    }
    
    public static int getIndex2(int [] array, int num){
        return Arrays.binarySearch(array, num);
    }
    
    //7.
    public static LinkedList<Integer> removeElement(LinkedList<Integer> array, int num){
        int position = array.indexOf(num);
        System.out.println("position = "+position);
        if(position >= 0){
            array.remove(position);
        }
        return array;
    }
    
    public static int[] removeElement2(int[] array, int num){
        int[] newArray = new int[array.length-1];
        int j= 0;
        for(int i=0; i<array.length; i++){
            if(array[i] != num){
                newArray[j++] = array[i];
            }
        }
        return newArray;
    }
    
    //8.
    public static int[] copyArray(int [] array){
        int[] newArray = new int[array.length];
        int j=0;
        for(int i:array){
            newArray[j++]=i;
        }
        return newArray;
    }
    
    //9.
    public static int[] insertElement(int[] array, int num, int index){
        int[] newArray = new int [array.length+1];
        for(int i=0; i<array.length; i++){
            if(i<index){
                newArray[i] = array[i];
            }else if(i==index){
                newArray[i] = num;
            }else{
                newArray[i]=array[i-1];
            }
            newArray[i+1] = array[i];
        }
        return newArray;
    }
    
    
    public static int[] insertElement2(int[] array, int num, int index){
        
        for(int i=array.length-1; i>index; i--){
            array[i] = array[i-1];      
        }
        array[index] = num;
        return array;
    }
    
    //10.
    public static void findMaximumAndMinimum(int[] array){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if(array.length==0){
            System.out.println("Empty array");
        }else if(array.length==1){
            min = array[0];
            max = min;
            System.out.println("Min value = Max value = "+max);
        }else{
        
            for(int i:array){
                if (i> max){
                    max = i;
                }
                if(i<min){
                    min = i;
                }
            }
            System.out.println("Min value = "+min+" - Max value = "+max);
        }  
    }
    
    //11.
    public static void reverseArray(int[] array){
        int temp;
        for(int i=0; i<array.length/2; i++){
            temp = array[array.length-(i+1)];
            array[array.length-(i+1)] = array[i];
            array[i] = temp;
        }
    }
    
    //12.
    public static void findDuplicate(int[] array){
        if(array.length == 0){
            System.out.println("Empty array");
        }else{
            HashSet<Integer> set = new HashSet<Integer>();
            for(int element : array){
                if(! set.add(element)){
                    System.out.println("Duplicate : "+element);
                }
            }
        }
    }
    //13.
    public static void findDuplicate(String[] array){
        if(array.length == 0){
            System.out.println("Empty array");
        }else{
            
            for(int i=0; i<array.length-1; i++){
                for(int j=i+1; j<array.length; j++){
                    if(array[i].equals(array[j]) && (i!=j)){
                        System.out.println("Duplicate : "+array[i]);
                    }
                }
            }
        }
    }
    
    //14.
    public static void commonElement(String[] array1, String[] array2){
        if(array1.length == 0 || array2.length == 0){
            System.out.println("Empty array");
        }else{
            for(int i=0; i<array1.length; i++){
                for(int j=0; j<array2.length; j++){
                    if(array1[i].equals(array2[j])){
                        System.out.println("Common element(s) : "+array1[i]);
                    }
                }
            }
        }
    }
    
    //15.
    public static void commonElement(int[] array1, int[] array2){
        if(array1.length == 0 || array2.length == 0){
            System.out.println("Empty array");
        }else{
            for(int i=0; i<array1.length; i++){
                for(int j=0; j<array2.length; j++){
                    if(array1[i]==(array2[j])){
                        System.out.println("Common element(s) : "+array1[i]);
                    }
                }
            }
        }
    }
    
    //16.
    public static void removeDuplicate(int[]array){
        if(array.length == 0){
            System.out.println("Empty array");
        }else{
            int last_element = array.length;
            for(int i=0; i<last_element-1; i++){
                for(int j=i+1; j<last_element; j++){
                    if((array[i] == array[j])){
                        for(int k=j; k<last_element-1; k++){
                            array[k] = array[k+1];
                        }
                        j--;
                        last_element --;
                    }
                }
            }
        }
    }
    
    //17.
    public static void secondLargest(int[] array){
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int index = array.length-1;
        
        if(array.length==0){
            System.out.println("Empty array");
        }else{
            Arrays.sort(array);
            firstLargest = array[array.length-1];
            while (array[index]==firstLargest){
                index--;
            }
            secondLargest = array[index];  
        }
        System.out.println("Second largest is "+secondLargest);
    }
    
    //18.
    public static void secondSmallest(int[] array){
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        int index = 0;
        
        if(array.length == 0){
            System.out.println("Empty array");
        }else{
            Arrays.sort(array); 
            firstSmallest = array[0];
            while(array[index]==firstSmallest){
                index++;
            }
            secondSmallest = array[index];
        }
        System.out.println("Second smallest is "+secondSmallest);
    }
    
    //19.
    
    //create random matrice
    public static int[][] createaRandomMatrice(){
        int[][] myMatrice = new int[10][10];
        
        Random r = new Random();
        for(int i=0; i<myMatrice[0].length; i++){
            for(int j=0; j<myMatrice[0].length; j++){
                myMatrice[i][j] = r.nextInt(10);
            }
        }
        return myMatrice;
    }
    public static void addTwoMatrices(int[][] matrice1, int[][] matrice2){
        
        if((matrice1.length == 0) || (matrice2.length == 0)){
            System.out.println("Empty matrice");
        }else{
            int taille = matrice1[0].length;
            for(int i=0; i<taille; i++){
                for(int j=0; j<taille; j++){
                    System.out.printf("%4d", (matrice1[i][j]+matrice2[i][j]));
                }
                System.out.println(" ");
            }
        }
    }
    
    //20.
    public static ArrayList<Integer> arrayToArrayList(int[] array){
        Integer[] tab = new Integer[array.length];
        tab=Arrays.stream(array).boxed().toArray(Integer[]::new);
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(tab));
       
        return arrayList;
    }
    
    //21.
    public static int[] arrayListToArray(ArrayList<Integer> arrayList){
        int[] tab = new int[arrayList.size()];
        //tab = Arrays.str
        tab = arrayList.stream().mapToInt(a -> a).toArray();
        return tab;
    }
    
    public static void main(String[] args) {
        int[] numArray = {56, 52, 21, 21, 78, 4, 5, 9, 9, 15, 52};
        int[] numArray2 = {57, 53, 22, 52, 79, 5, 6, 10, 17, 4};
        int[] emptyArray = {};
        int[] oneElementArray = {6};
        String[] stringArray = {"bla", "toto", "gui", "azer", "azer", "padg", "totom"};
        String[] stringArray2 = {"blaz", "totoe", "gui", "azert", "azery", "padgu", "toto"};
        System.out.println("Sort arrays :");
        System.out.println("Before (int) = "+Arrays.toString(numArray));
        System.out.println("Before (string) = "+Arrays.toString(stringArray));
        sortNumeric(numArray);
        sortString(stringArray);
        System.out.println("After (int) = "+Arrays.toString(numArray));
        System.out.println("After (string) = "+Arrays.toString(stringArray));
       
        System.out.println("1. Sum = "+sum(numArray));
        System.out.println("2. Sum = "+sum(numArray2));
        
        int[][] grid = new int[10][10];
        printGrid(grid, '1');
        
        System.out.println("1. Average = "+average(numArray));
        System.out.println("2. Average = "+average(numArray2));
        
        int value1 = 15;
        System.out.println("1. Has value "+value1+" -> "+ hasValue(numArray, value1));
        int value2 = 17;
        System.out.println("2. Has value "+value2+" -> "+ hasValue(numArray, value2));
        
        
        System.out.println("1. Get Index "+value1+"| -> "+ getIndex(numArray, value1));
        System.out.println("2. Get Index2 "+value2+"| -> "+ getIndex2(numArray, value2));
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(56);
        list.add(52);
        list.add(21);
        list.add(78);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(15);
        
        System.out.println("Linked list = "+list.toString());
        removeElement(list, value1);
        System.out.println("Remove element in Linked list = "+list.toString());
        System.out.println("Remove Element in Array = "+Arrays.toString(removeElement2(numArray, value1)));
        
        System.out.println("Copy elements in Array = "+Arrays.toString(copyArray(numArray)));
        System.out.println("Insert element in Array = "+Arrays.toString(insertElement(numArray, 10, 2)));
        insertElement2(numArray, 10, 2);
        System.out.println("Insert element2 in Array = "+Arrays.toString(numArray));
        findMaximumAndMinimum(emptyArray);
        findMaximumAndMinimum(oneElementArray);
        findMaximumAndMinimum(numArray);
        reverseArray(numArray);
        System.out.println("Reverse Array = "+Arrays.toString(numArray));
        findDuplicate(numArray);
        findDuplicate(stringArray);
        
        System.out.println("Common element");
        System.out.println(Arrays.toString(stringArray)+" - "+Arrays.toString(stringArray2));
        commonElement(stringArray, stringArray2);
        System.out.println(Arrays.toString(numArray)+" - "+Arrays.toString(numArray2));
        commonElement(numArray, numArray2);
        System.out.println("Remove duplicate");
        System.out.println(Arrays.toString(numArray));
        removeDuplicate(numArray);
        System.out.println(Arrays.toString(numArray));
        secondLargest(numArray);
        secondSmallest(numArray);
        System.out.println("Matrice A");
        int[][] matriceA = createaRandomMatrice();
        printGrid(matriceA, '.');
        System.out.println("Matrice B");
        int[][] matriceB = createaRandomMatrice();
        printGrid(matriceB, '.');
        System.out.println("Matrice A + Matrice B");
        addTwoMatrices(matriceA, matriceB);
        System.out.println("Array to ArrayList : "+arrayToArrayList(numArray).toString());
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(56);
        arrayList.add(52);
        arrayList.add(21);
        arrayList.add(24);
        arrayList.add(6);
        arrayList.add(28);
        arrayList.add(44);
        System.out.println("ArrayList to array : "+arrayListToArray(arrayList).toString());
    }
}
