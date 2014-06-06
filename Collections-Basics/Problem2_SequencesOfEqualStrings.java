package homework4Collections;

import java.util.Scanner;

//Problem 2.	Sequences of Equal Strings
//Write a program that enters an array of strings and finds in it
//all sequences of equal elements. The input strings are given as a single line, separated by a space. 

public class Problem2_SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter line with sequences of elements separated by space" +
		" Please enter \"end\" to stop the typing");
		
		String str = scan.nextLine();
		String[] mySeq = str.split(" ");
		
		System.out.println(mySeq[0]);
		
		for(int i = 1;i< mySeq.length; i++)
		{
			if(mySeq[i].equals(mySeq[i-1]))
			{
				System.out.print(" " + mySeq[i]);
			} else {
			System.out.println();
			System.out.print(mySeq[i]);
			}
		}
		
		scan.close();
	}

}
