package com.company.Array;

import java.util.Scanner;

//Given an array A[]  of n elements. Your task is to complete
// the Function num which returns an integer denoting the total number of times digit k appears in the whole array.
public class FindNumberOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size= sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the array elements");
        for (int i=0;i<size;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Enter the numner to be found");
        int k= sc.nextInt();
        System.out.println(num(a,size,k));

    }
    public static int num(int a[],int size,int k){
        int r,count=0;
        for(int i=0;i<size;i++){
            while (a[i]>0){
              r=a[i]%10;
              if(r==k){
                  count++;
              }
              a[i]=a[i]/10;
            }
        }
        return count;
    }
}
