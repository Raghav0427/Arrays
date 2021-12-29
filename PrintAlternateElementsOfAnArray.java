package com.company;

import java.util.Scanner;

public class PrintAlternateElementsOfAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size= sc.nextInt();
        int[] element=new int[size];
        System.out.println("Enter the Elements");
        for (int i=0;i<size;i++)
        {
            element[i]= sc.nextInt();
        }
        for(int i=0;i<size;i=i+2){
            System.out.println(element[i]);
        }
    }

}
