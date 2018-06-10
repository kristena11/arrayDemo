/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kristen Albrecht
 */
public class ArrayDemo {

    public static void main(String[] args) 
    {
        // TODO code application logic here
        int[] data = new int[5];
        Scanner in = new Scanner(System.in);
        
        for (int i = 0 ; i < data.length ; i++)
        {
            System.out.println("Enter value for index " + i + ":");
            data[i] = in.nextInt();
        }
        
        display(data);
           
        getAverage(data);
        
        getLargest(data);
        
        getSmallest(data);
    }
    
    static void display(int[] values)
    {
        System.out.println("The user entered the following numbers:");
        for (int i = 0 ; i < values.length ; i++)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println("");
    }
    
    static float getAverage(int[] data)
    {
        int total = 0;
        for (double i : data){
            total += i;
        }
        int average = total / data.length;
        
        System.out.println("average: " + average);
        return average;
    }
    
    static int getLargest(int[] data)
    {
        Arrays.sort(data);
        int largest = data[data.length-1];
        System.out.println("Maximum = " + largest);
        return largest;
    }
    
    static int getSmallest(int[] data)
    {
        Arrays.sort(data);
        int smallest = data[0];
        System.out.println("Minimum = " + smallest);
        return smallest;
    }  
    
    
}
