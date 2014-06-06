package homework3LoopsMethodsClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Problem 6.	Random Hands of 5 Cards
//Write a program to generate n random hands of 5 different cards form a standard suit of 52 cards. 


public class RandomHandOf5Cards {

	public static void main(String[] args) {
		String[] faces = {"2", "3", "4", "5","6", "7", "8", "9", "10", "J", "Q", "K" , "A"};
		String[] suits = {"♣", "♦", "♥" ,"♠"};
		
		System.out.println("Enter number n");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		ArrayList<String> allCards = new ArrayList<String>();

		for (String face : faces) {
            for(String suit : suits){
                    String tempcard = face + suit;
                    allCards.add(tempcard);
            }
        }

		

		for(int j = 0; j<number; j++) {
            Collections.shuffle(allCards);
            List<String> selectedCards = allCards.subList(0, 5);
            System.out.printf("%s\n",selectedCards.toString());
		}

		scan.close();

	}
	


}
