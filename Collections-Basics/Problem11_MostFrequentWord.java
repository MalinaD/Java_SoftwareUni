package homework4Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

//Problem 11.	Most Frequent Word
//Write a program to find the most frequent word in a text and print it, 
//as well as how many times it appears in format "word -> count".
//Consider any non-letter character as a word separator. Ignore the character casing.
//If several words have the same maximal frequency, print all of them in alphabetical order. 

public class Problem11_MostFrequentWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter sentence(s) and press Enter button twice");
		
		String str = scan.nextLine().toLowerCase();
		String[] mySeq = str.split("\\W+");

		scan.nextLine();

		Map<String, Integer> wordsCount = new HashMap<String, Integer>();
		
		for (String word : mySeq) {
		  Integer count = wordsCount.get(word);
		  if (count == null) {
		    count = 0; 
		  }
		  wordsCount.put(word, count+1);
		}
		
		int maxValueInMap=(Collections.max(wordsCount.values()));
		
		for (Entry<String, Integer> entry  : wordsCount.entrySet()) 
		{
			if(entry.getValue()==maxValueInMap)
			{
		    System.out.println(entry.getKey() + " -> " + entry.getValue()+ " times");
			}
		}
		
		scan.close();

	}

}
