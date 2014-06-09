package homework2;

import java.util.Scanner;

//Problem 7.	Count of Bits One
//Write a program to calculate the count of bits 1
//in the binary representation of given integer number n. 

public class CountOfBitsOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter integer number: ");
		int number = scan.nextInt();
		
		String binary = Integer.toBinaryString(number);
		
		char[] myCheck = binary.toCharArray();
		int count = 0;
		
		for(int i=0; i<myCheck.length; i++)
		{
			if(myCheck[i]=='1')
			{
				count++;
			}
		}
		System.out.println("The count of 1s is: " + count);

		scan.close();
	}

}
