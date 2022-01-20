package com.company.Array;

import java.util.Scanner;

//Given an array Arr (distinct elements) of size N. Rearrange the elements of array in zig-zag fashion.
// The converted array should be in form a < b > c < d > e < f.
// The relative order of elements is same in the output i.e you have to iterate on the original array only.
public class ZigZagFashion {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Array elements");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int temp;
        for(int i=0;i<n-1;i++){
            if(i%2!=0){
                if(arr[i]<arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            if(i%2==0){
                if(arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }


    }

}
