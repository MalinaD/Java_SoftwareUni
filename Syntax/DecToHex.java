package homework2;

import java.util.Scanner;

//Problem 5.	Decimal to Hexadecimal
//Write a program that enters a positive integer 
//number num and converts and prints it in hexadecimal
//form. You may use some built-in method from 
//the standard Java libraries. 

public class DecToHex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter positive number");
		int num = scan.nextInt();
		
		String hex = Integer.toHexString(num);
		System.out.println("The hexadecimal number is: "+hex);
		
		scan.close();

	}

}
