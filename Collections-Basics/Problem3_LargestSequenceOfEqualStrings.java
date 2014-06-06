package homework4Collections;

import java.util.Scanner;

//Problem 3.	Largest Sequence of Equal Strings
//Write a program that enters an array of strings and finds 
//in it the largest sequence of equal elements. If several sequences
//have the same longest length, print the leftmost of them. The input 
//strings are given as a single line, separated by a space. 

public class Problem3_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter line with sequences of elements separated by space" +
		" Please enter \"end\" to stop the typing");
		
		String str = scan.nextLine();
		String[] mySeq = str.split(" ");
		int count =0;
		int counter =1;
		String temp = "";
		
		for(int i = 1;i< mySeq.length; i++)
		{
			if(mySeq[i].equals(mySeq[i-1]))
			{
				temp = mySeq[i];
				count++;
				
			} else {
			count=1;
			}
			if (count > counter) {
				counter = count;
				}
		}
		
		for (int j = 0; j < counter - 1; j++) {
			System.out.print(temp + " ");
			}
			System.out.println(temp);
		
		scan.close();

	}

}
