/*Name: Dominick Mancini
 * Student ID: 100517944
 * Class: SOFE 2710U
 * Assignment 1, Exercise E2.14*/

public class DayTester {

	public static void main(String[] args) {
		
		Day d1 = new Day();						//Calls the Day.class and creates a new day that is today
		
		Day d1PlusTen = d1.addDays(10);			//Creates a new day that is ten days from today
		
		int today = d1.getDate();				//Gets the day it is today (Day of month)
		int thisMonth = d1.getMonth();			//Gets the month today is in
		int thisYear = d1.getYear();			//Gets this year
		
		int nextMonth = d1PlusTen.getMonth();	//Gets the day it is ten days from now (Day of month)
		int nextYear = d1PlusTen.getYear();		//Gets the month ten days from now
		int nextDay = d1PlusTen.getDate();		//Gets the year ten days from now
		
		int dayDifference = d1PlusTen.daysFrom(d1);	//Uses the Day class again to find the 
													//difference between today and ten days 
													//from now and assigns it as an integer
		
		//Outputs todays date (y/m/d)
		System.out.println("Today:\nThe Year is "+thisYear+"\nThe month is "+thisMonth+"\nThe day is "+today);
		
		//Outputs the date ten days from now (y/m/d)
		System.out.println("\nThe next date:\nYear: "+nextYear+"\nMonth: "+nextMonth+"\nDay: "+nextDay);
		
		//Output the number of days between these two dates.
		System.out.println("\nThe number of days between these dates is "+dayDifference+" days.");

	}

}
