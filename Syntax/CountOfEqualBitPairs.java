package homework2;

import java.util.Scanner;

//Count of Equal Bit Pairs
//Write a program to count how many sequences of 
//two equal bits ("00" or "11") can be found in 
//the binary representation of given integer number n (with overlapping). 

public class CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter integer number: ");
		int number = scan.nextInt();
		
		String binary = Integer.toBinaryString(number);
		
		char[] myCheck = binary.toCharArray();
		int count = 0;
		
		for(int i=0; i<myCheck.length-1; i++)
		{
			if((myCheck[i]=='1'&&myCheck[i+1]=='1')||(myCheck[i]=='0'&&myCheck[i+1]=='0'))
			{
				count++;
			}
		}
		System.out.println("The count of 1s is: " + count);

		scan.close();

	}

}
