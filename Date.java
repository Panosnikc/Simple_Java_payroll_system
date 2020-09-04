package demo;

public class Date {
	
	// Declare private variables
	private int month; // 1-12
	private int day; // 1-31 based on month
	private int year; // any year
	
	// Days in each month
	private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	// constructor: call checkMonth to confirm proper value for month;
	// call checkDay to confirm proper value for day
	public Date(int theMonth, int theDay, int theYear) {
	   month = checkMonth( theMonth ); 
	   year = theYear; 
	   day = checkDay( theDay ); 
	} 
	
	// utility method to confirm proper month value
	private int checkMonth(int testMonth) {
	   // Validate month
	   if (testMonth > 0 && testMonth <= 12) 
	      return testMonth;
	   else 
		  throw new IllegalArgumentException("month must be 1-12");
	} 
	
	// Method the validate the month
	private int checkDay(int testDay) {
		// check if day in range for month
		if (testDay > 0 && testDay <= daysPerMonth[month])
			return testDay;
	
		// check for leap year
		if (month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
			return testDay;
	
		throw new IllegalArgumentException("day out -of -range for the specified month and year");
	} 
	
	// getDay()
	public int getDay() {
		return day;
	} 
	
	// getMonth()
	public int getMonth() {
		return month;
	} 
	
	// getYear()
	public int getYear() {
		return year;
	} 
	
	 // return a String of the form month/day/year
	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	} 
}