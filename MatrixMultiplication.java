package com.company;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Row of matrix a");
        int row1= sc.nextInt();
        System.out.println("Enter the Col of matrix a");
        int col1=sc.nextInt();
        System.out.println("Enter the Row of matrix b");
        int row2= sc.nextInt();
        System.out.println("Enter the Col of matrix b");
        int col2= sc.nextInt();
        if(col1!=row2){
            System.out.println("Multiplication is Not Possible");
        }
        else
        {
            int a[][]=new int[row1][col1];
            int b[][]=new int[row2][col2];
            int c[][]=new int[row1][col2];
            System.out.println("Enter the Array a");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    a[i][j]= sc.nextInt();
                }
            }
            System.out.println("Enter the Array b");
            for(int i=0;i<row2;i++){
                for(int j=0;j<col2;j++){
                    b[i][j]= sc.nextInt();
                }
            }
            System.out.println("The Result is");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    c[i][j]=0;
                    for(int k=0;k<col1;k++){
                        c[i][j] += a[i][k]*b[k][j];
                    }
                    System.out.print(c[i][j] +" ");
                }
                System.out.println();
            }
        }
    }
}
