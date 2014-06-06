package homework3LoopsMethodsClasses;

import java.util.ArrayList;
import java.util.Iterator;

//import java.util.Arrays;
//import java.util.Collections;

//Problem 3.	Full House
//In most Poker games, the "full house" hand is defined 
//as three cards of the same face + two cards of the same face, other than the 
//first, regardless of the card's suits. The cards faces are "2", "3", "4", "5", 
//"6", "7", "8", "9", "10", "J", "Q", "K" and "A". The card suits are "♣", "♦", "♥" and
//"♠". Write a program to generate and print all full houses and print their number. 

public class FullHouse {

	public static void main(String[] args) {
		String[] faces = {"2", "3", "4", "5","6", "7", "8", "9", "10", "J", "Q", "K" , "A"};
		//String[] suits = {"♣", "♦", "♥" ,"♠"};
		String[] suits = {"\u2660", "\u2666", "\u2663" ,"\u2764"};
		//String[] cards = new String[13*4];

		ArrayList<String> allCards = new ArrayList<String>();

		//for(int i=0 ; i<13; i++)
		//{
		//	for(int j=0; j<3; j++)
		//	{
		//		cards[j]= faces[i]+suits[j];
		//        System.out.println(cards[j]);
		//	}			
		//}
		
		for (String face : faces) {
            for(String suit : suits){
                    String tempcard = face + suit;
                    allCards.add(tempcard);
            }
        }
		
		Iterator<String> iterator = allCards.iterator();
		int count =0;
		
		while (iterator.hasNext()) {
			
			String card1 = iterator.next();
			String card2 = iterator.next();
			String card3 = iterator.next();
			String card4 = iterator.next();
			String card5 = iterator.next();
			if(card1.charAt(0)==card2.charAt(0)&&card2.charAt(0)==card3.charAt(0)){
                if(card4.charAt(0)!=card1.charAt(0)&&card4.charAt(0)==card5.charAt(0)||card4.charAt(0)!=card5.charAt(0)){
                        System.out.printf("(%s%s%s%s%s)%n",card1,card2,card3,card4,card5);
                        count++;
		}
				
	}
			
		}
		System.out.println("The count is " + count);
	}
	
}




