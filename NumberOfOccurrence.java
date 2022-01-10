package com.company.Array;

import java.util.Scanner;

public class NumberOfOccurrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int n= sc.nextInt();
        System.out.println("Enter the Elements");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the Number");
        int x= sc.nextInt();
        System.out.println("The Number of Occurence is :"+ count(arr,n,x));

    }
    public static int count(int arr[],int n,int x){
        int count=0;
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                count ++;
            }
        }
        return count;
    }
}
