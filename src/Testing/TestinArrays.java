package Testing;

import java.util.*;
public class TestinArrays {
    //type : int, float, double, long....
    //is the type of data you are pulling into arrray
    //cannot mix data types
    public static void main (String []args){
        int num = 20;
        int [] numbers = new int[num/2];
        int sum = 0;
        for (int i=0; i< numbers.length; i++){
            numbers [i] = i*2;
            System.out.print(" " + numbers[i] + " ,");
            sum += numbers[i];
        }
        System.out.println();
        double average = sum/numbers.length;
        System.out.println(numbers[numbers.length-1]);
        System.out.println(average);
        int counter = 0;
        for (int i=0;i < numbers.length;i++){
            if (numbers[i]>average){
                counter++;
            }
        }
        System.out.println(counter);
    }
}