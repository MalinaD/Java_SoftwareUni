package homework4Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

//Problem 12.	Cards Frequencies
//We are given a sequence of N playing cards from a standard deck. The input 
//consists of several cards (face + suit), separated by a space. Write a program to 
//calculate and print at the console the frequency of each card face in format 
//"card_face -> frequency". The frequency is calculated by the formula appearances / N and
//is expressed in percentages with exactly 2 digits after the decimal point. The card faces 
//with their frequency should be printed in the order of the card face's first appearance 
//in the input. The same card can appear multiple times in the input, but it's face should 
//be listed only once in the output.

public class Problem12_CardFrequences {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter sentence of cards and press Enter button twice");
		
		String str = scan.nextLine();
		String[] mySeq = str.split("[♥♣♦♠ ]+");

		Map<String, Integer> cardsCount = new HashMap<String, Integer>();
		
		for (String word : mySeq) {
		  Integer count = cardsCount.get(word);
		  if (count == null) {
		    count = 0; 
		  }
		  cardsCount.put(word, count+1);
		}
		
		
		for (Entry<String, Integer> entry  : cardsCount.entrySet()) 
		{

		    System.out.printf("%s -> %.2f%% \n ",entry.getKey(), ((double)entry.getValue()*100/mySeq.length));

		}
		
		scan.close();


	}

}
