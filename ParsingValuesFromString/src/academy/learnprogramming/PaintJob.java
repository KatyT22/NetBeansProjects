/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming;

/**
 *
 * @author katy
 */
public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)){
            return -1;
        }
        System.out.println("wall area = "+(width*height));
        System.out.println("total buckets = "+Math.ceil((width*height)/areaPerBucket));
        System.out.println("buckets to buy = ");
        
        return (int)(Math.ceil((width*height)/areaPerBucket)-extraBuckets);
    }
    
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0)){
            return -1;
        }
        return getBucketCount(width, height, areaPerBucket, 0);
    }
    
    public static int getBucketCount(double area, double areaPerBucket){
        if((area <= 0) || (areaPerBucket <= 0)){
            return -1;
        }
        return (int) (Math.ceil(area/areaPerBucket));
    }
    
    
}
