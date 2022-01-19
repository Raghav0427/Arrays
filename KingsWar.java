package com.company.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//King is getting ready for a war. He know his strengths and weeknesses so he is taking required number of soldiers with him.
//King can only defeat enemies with strongest and weakest power, and one soldier can only kill one enemy.
//Your task is to calculate that how many soldiers are required by king to take with him for the war.
//Note: The array may contain duplicates.

public class KingsWar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array");  //Taking the Array size
        int size= sc.nextInt();
        int power[]=new int[size]; // Taking the Array elemnts
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            power[i]= sc.nextInt();
        }


        int max=power[0];

        for(int i=0;i<size;i++){           //Checking for the largest element
            if(max<power[i])
            {
                max=power[i];
            }
        }
        int min=power[0];

        for(int i=0;i<size;i++){       // Checking for the smallest element
            if(min>power[i])
            {
                min=power[i];
            }
        }
        int count=0;
       for(int i=0;i<size;i++){
           if(min==power[i] || max==power[i]){ // checking for the duplicates and then increasing the count
               count++;
           }
       }
       int soldier= power.length-count;    // subtracting the count from total number of array element to find the number of soldiers
        System.out.println(soldier);

    }

}
