package demo;

public class HourlyEmployee extends Employee {

	// Declare variables for HourlyEmply
	private double hourlyWage; // wage per hour
	 private double hoursWorked; // hours worked for week
	
	 // Constructor with five-argument and inherits the attributes from the base class Employee
	 public HourlyEmployee(String firstName, String lastName ,String ssn , int month, int day, int year, double hourlyWage , double hoursWorked) {
		 super(firstName , lastName ,ssn ,month ,day ,year);
		 
		 setHourlyWage(hourlyWage); // validate and store hourly wage
		 setHoursWorked(hoursWorked); // validate and store hours worked
	 }
	
	 // Setters & Getters
	 public void setHourlyWage(double hourlyWage) {
		 if (hourlyWage >= 0.0)
			 this.hourlyWage = hourlyWage;
		 else
			 throw new IllegalArgumentException("Hourly wage must be >= 0.0");
	 } 
	 
	 public double getHourlyWage() {
		 return hourlyWage;
	 } 
	 
	 public void setHoursWorked(double hoursWorked) {
		 if ((hoursWorked >= 0.0) && (hoursWorked <= 168.0))
			 this.hoursWorked = hoursWorked;
		 else
			 throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
	 } // end method setHours
	
	 public double getHoursWorked() {
		 return hoursWorked;
	 } 
		 
	 // calculate earnings; override abstract method earnings in Employee
	 @Override
	 public double earnings() {
		 if (getHoursWorked() <= 40) // no overtime
			 return getHourlyWage () * getHoursWorked();
		 else
			 return 40 * getHourlyWage() + (getHoursWorked() - 40) * getHourlyWage() * 1.5;
	 } 
	
	 // return String representation of HourlyEmployee object
	 @Override
	 public String toString() {
		 return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f", super.toString(), 
				 "hourly wage", getHourlyWage(), "hours worked", getHoursWorked());
	} 
}
