package com.company;

import java.util.Scanner;

public class CountOfSmallerElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int size= sc.nextInt();
        int[] element=new int[size];
        System.out.println("Enter the Elements");
        for (int i=0;i<size;i++)
        {
            element[i]= sc.nextInt();
        }
        System.out.println("Enter the Number");
        int numb= sc.nextInt();
        System.out.println("The number of elements are "+countOfElements(element,size,numb));

    }
    public static int  countOfElements(int element[],int size,int numb){
        int count=0;
       for(int i=0;i<size;i++){
           if(element[i]<=numb){
               count++;
           }
       }
       return count;
    }
}
