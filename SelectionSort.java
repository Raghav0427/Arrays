package com.company;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int size= sc.nextInt();
        int a[]=new int[size];
        int n=a.length;
        System.out.println("Enter the array A");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int min_Index=i;
            for(int j=i;j<n;j++){

                if(a[j]<a[min_Index]){
                    min_Index=j;
                }
            }
            int temp=a[i];
            a[i]=a[min_Index];
            a[min_Index]=temp;
        }
        System.out.println("The Sorted array is : ");
        for (int item: a){
            System.out.print(item+" ");
        }
    }
}
