package homework4Collections;

import java.util.Scanner;

//Problem 5.	Count All Words
//Write a program to count the number of words in given sentence. 
//Use any non-letter character as word separator.


public class Problem5_CountAllWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter sentence");
		
		String str = scan.nextLine();
		String[] mySeq = str.split("\\W+");

		int count = mySeq.length;
		System.out.println("The amount of words is " +count);
		
		scan.close();


	}

}
