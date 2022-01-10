package com.company.Array;

import java.util.Scanner;

public class RotateArrayByOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int size=sc.nextInt();
        System.out.println("Enter the array Elements");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=size-1;i>0;i--){
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
        for(int i=0;i<size;i++){
            System.out.println("The rotated Array is: "+arr[i]);
        }

    }

}
