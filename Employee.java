package demo;

public abstract class Employee {
	
	// Declare private variables
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private Date birthDate;
	 
	// Employee Constructor
	public Employee(String firstName, String lastName, String ssn, int month, int day, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		socialSecurityNumber = ssn;
		birthDate = new Date(month, day, year);
	} 
	
	 //set firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName; 
	} 
	
	// get firstName
	public String getFirstName() {
		return firstName;
	} 
	
	 // set lastName
	 public void setLastName(String lastName) {
		 this.lastName = lastName; 
	 } 
	 
	 // get lastName
	 public String getLastName() {
		 return lastName;
	 } 
	
	// set socialSecurityNumber
	 public void setSocialSecurityNumber(String ssn) {
		 socialSecurityNumber = ssn; 
	 } 
	
	 // get socialSecurityNumber
	 public String getSocialSecurityNumber() {
		 return socialSecurityNumber;
	 } 
	
	 // set birthDate
	 public void setBirthDate(int month, int day, int year) {
		 birthDate = new Date(month, day, year);
	 } 
	
	 // get birthDate
	 public Date getBirthDate() {
		 return birthDate;
	 } 
	 
	 // return String representation of Employee object
	 public String toString() {
		 return String.format("%s %s\n%s: %s\n%s: %s", getFirstName(), getLastName(),
				 "social security number: ", getSocialSecurityNumber(), "birth date: ", getBirthDate());
	 } 
	
	// abstract method overridden by concrete subclasses
	public abstract double earnings(); // no implementation here
	
}
