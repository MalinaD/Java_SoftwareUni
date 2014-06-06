package homework4Collections;

import java.util.ArrayList;
import java.util.Scanner;

//Problem 9.	Combine Lists of Letters
//Write a program that reads two lists of letters l1 and l2 and combines them:
//appends all letters c from l2 to the end of l1, but only when c does not
//appear in l1. Print the obtained combined list. All lists are given as sequence of
//letters separated by a single space, each at a separate line. Use ArrayList<Character>
//of chars to keep the input and output lists. 

public class Problem9_CombineListOfLetters {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
		ArrayList<Character> l1 = new ArrayList<Character>();
		ArrayList<Character> l2 = new ArrayList<Character>();
		
		ArrayList<Character> temp = new ArrayList<Character>();
		
		
		System.out.println("Enter elements for list 1");
		for (char ch1 : scan.nextLine().toCharArray()) {
			l1.add(ch1);
			}
		
		System.out.println("Enter elements for list 2 and press enter twice");
		for (char ch2 : scan.nextLine().toCharArray()) {
			l2.add(ch2);
			}
		
		temp.addAll(l1);
		
		 for (char c : scan.nextLine().replaceAll("\\s+", "").toCharArray()) {
             if (!l1.contains(c)) {
            	 temp.add(c);
             }
             
     }

     for (char c : temp) {
             System.out.print(c + " ");
     }
		 } catch (Exception e) {
             e.printStackTrace();
     }

	}

}
