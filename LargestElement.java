package com.company;


import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int n=sc.nextInt();
        int[] number=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
          number[i]=sc.nextInt();
        }
        System.out.println("The Result is "+largestElement(number,n));
    }
    public static int largestElement(int number[], int size){
        int min=number[0];
     for(int i=0;i<size;i++){
   if(min<number[i])
   {
       min=number[i];
   }
     }
return min;
    }
}
