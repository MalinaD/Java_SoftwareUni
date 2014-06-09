package homework2;

import java.util.Scanner;

//Problem 6.	Formatting Numbers
//Write a program that reads 3 numbers: 
//an integer a (0 ≤ a ≤ 500), 
//a floating-point b and a floating-point c and prints them in 4 virtual
//columns on the console. Each column should have a width of 10 characters.
//The number a should be printed in hexadecimal, left aligned; 
//then the number a should be printed in binary form, 
//padded with zeroes, then the number b should be printed with 2 digits 
//after the decimal point, right aligned; the number c should be printed 
//with 3 digits after the decimal point, left aligned. 

public class FormattingNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a = scan.nextInt();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		
		if(a>=0 && b <=500)
		{
			String hex = Integer.toHexString(a);
			hex=hex.toUpperCase();
			
			String binary = Integer.toBinaryString(a).replace(" ", "0");
			
			System.out.format("|%-10s  |%10s |    %10.2f|%-10.3f    |", hex,binary, b,c);
			
			
		}

		scan.close();
	}

}
