package homework2;

import java.util.Scanner;

//Write a program that enters 3 points in the plane 
//(as integer x and y coordinates), calculates and 
//prints the area of the triangle composed by these 
//3 points. Round the result to a whole number. In case 
//the three points do not form a triangle, print "0" as 
//result. 

public class TriangleArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter coordinates x and y for point a");
		int xA = scan.nextInt();
		int yA = scan.nextInt();
		
		System.out.println("Enter coordinates x and y for point b");
         int xB = scan.nextInt();
         int yB = scan.nextInt();
		
		System.out.println("Enter coordinates x and y for point c");
         int xC = scan.nextInt();
         int yC =scan.nextInt();
         
         double a = Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));
         double b = Math.sqrt(Math.pow(xC - xB, 2) + Math.pow(yC - yB, 2));
         double c = Math.sqrt(Math.pow(xC - xA, 2) + Math.pow(yC - yA, 2));
  
         if (a + b > c && b + c > a && a + c > b)
         {
             double p = (a + b + c) / 2;
             double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
             System.out.println("The are is"+ area);
         }
         else
         {
             System.out.println(0);
         }

         scan.close();
	}

}
