package homework2;

import java.util.Scanner;

//Problem 3.	Points inside a Figure
//Write a program to check whether a point is 
//inside or outside of the figure below. 
//The point is given as a pair of floating-point 
//numbers, separated by a space. Your program 
//should print "Inside" or "Outside". 

public class PointsInFigure {

	
//  int    polySides  =  how many corners the polygon has
//  float  polyX[]    =  horizontal coordinates of corners
//  float  polyY[]    =  vertical coordinates of corners
//  float  x, y       =  point to be tested
	
	public static int polySides = 12;
	public static double polyX[] = {6, 6,8.5, 8.5,8.5, 8.5, 13.5, 13.5, 8.5, 8.5,13.5,13.5 };
	public static double polyY[] = {12.5,22.5,22.5,12.5, 12.5, 17.5, 17.5,12.5, 20, 20.5,20.5, 20};

			
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two coorcinates for a point");
	double x = scan.nextFloat();
	double y = scan.nextFloat();
	boolean check = pointInPolygon(x,y);
	if(check){
		System.out.println("Inside");
	}
	else System.out.println("Outside");

     scan.close();
	}
	
	public static  Boolean pointInPolygon(double a, double b) {

		  int   i, j=polySides-1 ;
		   boolean oddNodes=false ;

		   for (i=0; i<polySides; i++) {
			    if ((polyY[i]< b && polyY[j]>=b
			    ||   polyY[j]< b && polyY[i]>=b)
			    &&  (polyX[i]<=a || polyX[j]<=a)) 
			    {
			      if (polyX[i]+(b-polyY[i])/(polyY[j]-polyY[i])*(polyX[j]-polyX[i])<a)
			      {
			        oddNodes=(!oddNodes); 
			      }
			    }
			    j=i; 
			}

		  return oddNodes; }

}
