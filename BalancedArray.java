package com.company.Array;

import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array and it has to be even");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Enter the Array Elements");
            long[] a=new long[n];
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
            }
            System.out.println("The Value needed is :"+valueToBalance(a,n));
        }
        else
        {
            System.out.println("Invalid Size");
        }
    }
    public static long valueToBalance(long a[],int n){
        int sum=0;
        int sum1=0;
        int val=0;
        for(int i=0;i<n/2;i++){
            sum +=a[i];
        }
        for(int i=n/2;i<n;i++){
            sum1 +=a[i];
        }
        if(sum>sum1){
             val=sum-sum1;
        }
        else if(sum1>sum){
             val=sum1-sum;
        }
        else{
            return 0;
        }
        return val;
    }
}
