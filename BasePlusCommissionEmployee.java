package demo;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	// Declare private variable
	private double baseSalary; // base salary per week
	
	// nine -argument constructor
	public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, int month, int day, int year, double sales, double rate, double baseSalary) {
		super(firstName, lastName, ssn, month, day, year, sales, rate);
		setBaseSalary( baseSalary ); // validate and store base salary
	 } 
	
	 // set baseSalary
	 public void setBaseSalary(double baseSalary) {
		 if (baseSalary >= 0.0)
			 this.baseSalary = baseSalary;
		 else
			 throw new IllegalArgumentException("Base salary must be >= 0.0");
	 } 
	 
	 // get baseSalary
	 public double getBaseSalary() {
		 return baseSalary;
	 } // end method getBaseSalary
	
	 // calculate earnings; override method earnings in CommissionEmployee
	 @Override
	 public double earnings() {
		 return getBaseSalary() + super.earnings();
	 } 
	
	 // return String representation of BasePlusCommissionEmployee object
	 @Override
	 public String toString() {
		 return String.format("%s %s; %s: $%,.2f", "base -salaried", super.toString(), "base salary", getBaseSalary() );
	 }
}
