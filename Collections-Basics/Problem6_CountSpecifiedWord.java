package homework4Collections;

import java.util.Scanner;

//Problem 6.	Count Specified Word
//Write a program to find how many times a word appears in given text.
//The text is given at the first input line. The target word is
//given at the second input line. The output is an integer number.
//Please ignore the character casing. Consider that any non-letter character is a word separator

public class Problem6_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter sentence(s) and press Enter button twice");
		
		String str = scan.nextLine();
		String[] mySeq = str.split("\\W+");

		scan.nextLine();
		System.out.println("Enter word for counting ");
        String word= scan.nextLine();		

		int count = 0;
		
		for(int i=0; i< mySeq.length; i++)
		{
			if(mySeq[i].equals(word))
			{
				count++;
			}
		}
		
		System.out.println("The amount of words is " +count);
		
		scan.close();

	}

}
