package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class PrintTheLeftElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int size= sc.nextInt();
        System.out.println("Enter the array Elements");
        int[] element=new int[size];
        for(int i=0;i<size;i++)
        {
            element[i] = sc.nextInt();
        }
        System.out.println("The element is "+leftElement(element,size));
    }
    public static int leftElement(int element[],int size){
        int mid;
        Arrays.sort(element);
        if(size%2==0)
        {
            mid=element[(size/2)-1];
        }
        else{
            mid=element[size/2];
        }
   return mid;
        }
}
