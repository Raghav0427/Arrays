package com.company;

import java.util.Scanner;

public class printAnElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int size= sc.nextInt();
        System.out.println("Enter the Elements");
        int[] element=new int[size];
        for(int i=0;i<size;i++)
        {
            element[i]=sc.nextInt();
        }
        System.out.println("Enter the Index");
        int key=sc.nextInt();
        System.out.println("The Element is "+printElement(element,size,key));
    }
    public static int printElement(int element[], int size, int key){
      int e=element[key];
      return e;
    }
}
