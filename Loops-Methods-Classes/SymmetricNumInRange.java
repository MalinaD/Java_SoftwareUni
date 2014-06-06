package homework3LoopsMethodsClasses;

import java.util.Scanner;

//Problem 1.	Symmetric Numbers in Range
//Write a program to generate and print all symmetric numbers in 
//given range [start…end]. A number is symmetric if its digits are 
//symmetric toward its middle. For example, the numbers 101, 33, 989 and 5
//are symmetric, but 102, 34 and 997 are not symmetric. 

public class SymmetricNumInRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers for range [n..m]");
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		if(n>0 && m>0)
		{
			if(n<m)
			{
				//we will have range [n..m]
				boolean checkNum = false;
				
				for(int i=n; i<=m;i++)
				{
					checkNum= isSymmetric(i);
					if(checkNum)
						System.out.printf("%d \n", i);
				}
			}
		}
		scan.close();

	}
	
	public static boolean isSymmetric(int num)
	{
		String val = String.valueOf(num); // Get the string.
		StringBuilder sb = new StringBuilder(val);
		
		return (val.equals(sb.reverse().toString())); // if the reverse is the same
	}

}
