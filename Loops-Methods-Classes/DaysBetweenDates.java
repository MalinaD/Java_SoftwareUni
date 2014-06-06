package homework3LoopsMethodsClasses;

import java.util.Scanner;
import org.joda.time.DateTime;
import org.joda.time.Days;

//Problem 7.	Days between Two Dates
//Write a program to calculate the difference between two dates 
//in number of days. The dates are entered at two consecutive lines
//in format day-month-year. Days are in range [1…31]. Months are in range [1…12].
//Years are in range [1900…2100]. 

public class DaysBetweenDates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter dates");
		
        String startDate = scan.nextLine();
        String endDate = scan.nextLine();
        
        String[] first = startDate.split("-");
        String[] second = endDate.split("-");
        DateTime past = new DateTime(Integer.parseInt(first[2]), Integer.parseInt(first[1]),
                        Integer.parseInt(first[0]), 0,0);
        
        DateTime today = new DateTime(Integer.parseInt(second[2]), Integer.parseInt(second[1]),
                        Integer.parseInt(second[0]), 0,0);
        
        int days = Days.daysBetween(past, today).getDays();
        System.out.println("The days between are " +days);

        scan.close();
	}

}
