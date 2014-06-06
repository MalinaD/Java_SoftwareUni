package homework3LoopsMethodsClasses;

import java.util.Scanner;

//Problem 2.	Generate 3-Letter Words
//Write a program to generate and print all 3-letter words consisting 
//of given set of characters. For example if we have the characters 'a' and 'b', all 
//possible words will be "aaa", "aab", "aba", "abb", "baa", "bab", "bba" and "bbb". 
//The input characters are given as string at the first line of the input. Input characters 
//are unique (there are no repeating characters). 

public class Generate3LettersWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter set of characters:");
		String input = scan.nextLine();
		
		char[] charArrayOfString = input.toCharArray();
		
		possibleStrings(3, charArrayOfString,"");

		scan.close();
	}
	


	    public static void possibleStrings(int maxLength, char[] alphabet, String str) {

	        // If the current string has reached it's maximum length
	        if(str.length() == maxLength) {
	            System.out.println(str);

	        // Else add each letter from the alphabet to new strings and process these new strings again
	        } else {
	            for(int i = 0; i < alphabet.length; i++) {
	                String oldStr = str;
	                str += alphabet[i];
	                possibleStrings(maxLength,alphabet,str);
	                str = oldStr;
	            }
	        }
	    }


}
