package homework4Collections;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Problem10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter sentence(s)");
		
		String str = scan.nextLine().toLowerCase();
		String[] mySeq = str.split("\\W+");

		Set<String> unique = new TreeSet<String>();


		System.out.println();

		
		for(int i=0; i<mySeq.length;i++)
		{
			unique.add(mySeq[i]);
		}
		
		for (String word : unique) 
		{
			System.out.print(word + " ");
		}
		
		scan.close();

	}

}
