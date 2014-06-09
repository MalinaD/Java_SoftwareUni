package homework2;

import java.util.Scanner;

public class SmallestThan3Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		//int first = scan.nextInt();
		//int second = scan.nextInt();
		//int third = scan.nextInt();
		int temp,c,d;
		
		int[] myArray = new int[3];

		
		for(int j = 0 ; j<myArray.length;j++)
		{
			myArray[j]=scan.nextInt();
		}
		
	    for (c = 0; c < ( 2 - 1 ); c++) {
	        for (d = 0; d < 2 - c-1 ; d++) {
			if(myArray[d]>myArray[d+1])
			{
				temp = myArray[d];
				myArray[d]=myArray[d+1];
				myArray[d+1]= temp;
			}
		}
	    }
		

		System.out.println(myArray[0]);
		scan.close();
	}

}
