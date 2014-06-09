package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestThan3Numbers1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		double [] myArray = new double[3];
		
		for(int i= 0; i<myArray.length; i++)
		{
		myArray[i]=scan.nextDouble();	
		}
		
		Arrays.sort(myArray);
		//check double or int and print like integer
		if(myArray[0] == (int) myArray[0]){
			System.out.println((int)myArray[0]);
			}
			else{
		System.out.println(myArray[0]);
		
        scan.close();
	}

	}
}
