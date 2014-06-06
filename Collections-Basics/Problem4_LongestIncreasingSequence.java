package homework4Collections;

import java.util.Scanner;

//Problem 4.	Longest Increasing Sequence
//Write a program to find all increasing sequences inside an array of integers.
//The integers are given in a single line, separated by a space. Print the sequences
//in the order of their appearance in the input array, each at a single line. 
//Separate the sequence elements by a space. Find also the longest increasing 
//sequence and print it at the last line. If several sequences have the same 
//longest length, print the leftmost of them. 

public class Problem4_LongestIncreasingSequence {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter line with numbers separated by space");
		
		String str = scan.nextLine();
		String[] mySeq = str.split(" ");
		int count =0;
		int counter =1;
		int position = 0; 
		
		int[] intArray = new int[mySeq.length];

		for(int m = 0; m< mySeq.length; m++)
		{
			intArray[m] = Integer.parseInt(mySeq[m]);
		}
		
		
		System.out.print(intArray[0]);
		for(int i = 1;i< mySeq.length; i++)
		{
			if(intArray[i]>intArray[i-1])
			{
				count++;
				System.out.print(" " + intArray[i]);
				
			} else {
			count=1;
			System.out.println();
			System.out.print(intArray[i]);
			}
			
			if (count > counter) {
				counter = count;
				position = i;
				}
		}
		
		System.out.println();
		System.out.print("The longest is: ");
		for (int j = 0; j < counter - 1; j++) {
			System.out.print(intArray[position - count + 1 + j] + " ");
			}
		System.out.print(intArray[position]);
		
		scan.close();
	}

}
