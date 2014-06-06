package homework3LoopsMethodsClasses;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Problem 5.	Angle Unit Converter (Degrees ↔ Radians)
//Write a method to convert from degrees to radians. Write a method to convert 
//from radians to degrees. You are given a number n and n queries for conversion. 
//Each conversion query will consist of a number + space + measure. Measures are "deg" and "rad".
//Convert all radians to degrees and all degrees to radians. Print the results as n lines, 
//each holding a number + space + measure. Format all numbers with 6 digit after the decimal point.


public class AngleUnitConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number n and n queries after it for conversion");
		
		int n = input.nextInt();
		String[] myArr = new String[n];
		
		for(int i=0; i<n; i++)
		{
			myArr[i]=Converter(input.nextLine());

			continue;
		}
		
		for(int i=0; i<myArr.length;i++)
			System.out.printf("%s\n", myArr[i]);

		input.close();

	}
	
	public static String  Converter(String query){
		Pattern p = Pattern.compile("\\w+");
		Pattern pattern = Pattern.compile(".*[^0-9].*");

		Matcher number = pattern.matcher(query);
		Matcher m = p.matcher(query);
		
       String str = null;
		while (m.find()) {
			str = m.group();
		}
		
	       double num = 0;
			while (number.find()) {
				num = Double.parseDouble(number.group());
			}
		
		if (str.equals("deg")){
			return  (Math.toRadians(num) + " rad");
			
		}
		else if(str.equals("rad")){
			return  (Math.toDegrees(num)+" deg");
		}
		return str;
	}

}
