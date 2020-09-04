package demo;

public class CommissionEmployee extends Employee {

	// Declare private variables
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage
	
	
	// Constructor with five-argument and inherits the attributes from the base class Employee
	public CommissionEmployee(String firstName, String lastName, String ssn, int month, int day, int year, double sales, double rate) {
	   super(firstName, lastName, ssn, month, day, year);
	   
	   // 
	   setGrossSales(sales);
	   setCommissionRate(rate);
	} 
	
	// Setter and Getter
	public void setCommissionRate(double rate) {
	   if (rate > 0.0 && rate < 1.0)
		  commissionRate = rate;
	   else
		  throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
	}  
	
	public double getCommissionRate() {
	   return commissionRate;
	} 
	
	public void setGrossSales(double sales) {
	   if (sales >= 0.0)
		  grossSales = sales;
	   else
		  throw new IllegalArgumentException("Gross sales must be >= 0.0");
	} 
	
	public double getGrossSales() {
	   return grossSales;
	} 
	
	// calculate earnings; override abstract method earnings in Employee
	@Override
	public double earnings() {
	   return getCommissionRate() * getGrossSales();
	} 
	
	// return String representation of CommissionEmployee object
	@Override
	public String toString() {
	   return String.format("%s: %s\n%s: $%,.2f; %s: %.2f", "commission employee", super.toString(), 
			   "gross sales", getGrossSales(), "commission rate", getCommissionRate());
	} 
}
