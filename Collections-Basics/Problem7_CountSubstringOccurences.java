package homework4Collections;

import java.util.Scanner;

//Problem 7.	Count Substring Occurrences
//Write a program to find how many times given string appears in given 
//text as substring. The text is given at the first input line. 
//The search string is given at the second input line. The output is 
//an integer number. Please ignore the character casing. 

public class Problem7_CountSubstringOccurences {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter sentence(s) and press Enter button twice");
		
		String str = scan.nextLine().toLowerCase();

		scan.nextLine();
		System.out.println("Enter word for counting ");
        String word= scan.nextLine().toLowerCase();		

		int count = 0;

		
		for(int i=0; i<= str.length()-word.length(); i++)
		{
			if (str.substring(0 + i, word.length() + i).contains(word)) {
				count++;
				}
		}
		
		System.out.println("The amount of substrings is " +count);
		
		scan.close();

	}

}
