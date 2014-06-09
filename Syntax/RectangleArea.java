package homework2;

import java.util.Scanner;

//Write a program that enters the sides of a rectangle
//(two integers a and b) and calculates and prints 
//the rectangle's area.

public class RectangleArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a: ");
	    int a = scan.nextInt();
	    
	    System.out.println("Please enter b: ");
	    int b = scan.nextInt();
	    
	    int area = a*b;
	    System.out.println("The are of " +a +" and "+b+ " is " + area);
	    
	    scan.close();

	}

}
