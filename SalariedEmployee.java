package demo;

public class SalariedEmployee extends Employee {
	
	// Declare private variable
	private double weeklySalary;
	
	 // Constructor with seven-argument and Inherits variables from base class
	public SalariedEmployee(String firstName, String lastName, String ssn, int month, int day, int year, double weeklySalary) {
		super( firstName, lastName, ssn, month, day, year); // pass to Employee  - constructor
		setWeeklySalary( weeklySalary ); // validate and store salary
	 } // end four -argument SalariedEmployee constructor
	
	 // Setter weeklySalary
	 public void setWeeklySalary(double weeklySalary) {
		 if (weeklySalary >= 0.0)
			 this.weeklySalary = weeklySalary;
		 else
			 throw new IllegalArgumentException("Weekly salary must be >= 0.0");
	 } 
	
	 // Getter weeklySalary
	 public double getWeeklySalary() {
		 return weeklySalary;
	 } 
	 
	 // calculate earnings; override abstract method earnings in Employee
	 @Override
	 public double earnings() { 
		 return getWeeklySalary();
	 } 
	
	 // return String representation of SalariedEmployee object
	 @Override
	 public String toString() {
		 return String.format("salaried employee: %s\n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
	 }
}
