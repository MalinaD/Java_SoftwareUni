package homework4Collections;

import java.util.Arrays;
import java.util.Scanner;

//Problem 1.	Sort Array of Numbers
//Write a program to enter a number n and n integer numbers and sort
//and print them. Keep the numbers in array of integers: int[]. 

public class Problem1_SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number n and n integers after that");
		
		int n = scan.nextInt();
		scan.nextLine();
		int [] mySortArray = new int[n];
		
		for(int i=0; i<n; i++)
		{
			mySortArray[i] = scan.nextInt();
		}
		
		Arrays.sort(mySortArray);
		
		for(int j=0; j<n; j++)
		{
			System.out.print(" " +mySortArray[j]);
		}

		scan.close();
	}

}
