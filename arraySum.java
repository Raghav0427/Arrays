package arrays;
import java.util.Scanner;

//Given an array of N integers. Your task is to print the sum of all of the integers.



public class arraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Array Elements");
      int n=sc.nextInt(); // asking for size of array
      long[] marks = new long [n]; //initializing array of n size
      System.out.println("Enter the marks");
      for(int i=0;i<n;i++) {
			 marks[i]=sc.nextLong(); //taking inputs for my array
		 }
     
      System.out.print(getSum(marks,n)); //calling the function to get the sum of my array
	
	}
	
	public static long getSum(long marks[],long size) {
		
		 long sum=0; //initializing a variable to store the sum of my array
	      for(int i=0;i<size;i++) {
	    	  sum=sum+marks[i];//traversing through my array and storing the sum of my array elements
	      }
	    return sum; //returning the sum of the array.
	}

}
