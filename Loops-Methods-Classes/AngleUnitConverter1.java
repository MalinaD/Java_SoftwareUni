package homework3LoopsMethodsClasses;

import java.util.Scanner;

public class AngleUnitConverter1 {

	public static void main(String[] args) {
		System.out.println("Enter number n and n queries after it for conversion");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] myArr = new String[n];
		for (int i = 0; i < n; i++) {
			
			myArr[i]=DegToNum(input);
			continue;
		}
		for(int i=0; i<myArr.length;i++)
		System.out.printf("%s\n", myArr[i]);

	}

	private static  String DegToNum(Scanner input) {
		double num = input.nextDouble();
		String str = input.next("\\w+");
		if (str.equals("deg")){
			return  (Math.toRadians(num) + " rad");
			
		}
		else if(str.equals("rad")){
			return  (Math.toDegrees(num)+" deg");
		}
		return str;
	}

}

