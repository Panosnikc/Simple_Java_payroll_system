package demo;

import java.util.Scanner;

public class PayrollSystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		// create subclass objects
		SalariedEmployee salariedEmployee = new SalariedEmployee("Maria", "Iona", "111-11-1111", 6, 15, 1944, 800.00);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Athina", "Papa", "222-22-2222", 12, 29, 1960, 16.75, 40);
		CommissionEmployee commissionEmployee = new CommissionEmployee( "Ioannis", "Mixos", "333-33-3333", 9, 8, 1954, 10000, .06);
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Panayiotis", "Kolas", "444-44-4444", 3, 2, 1965, 5000, .04, 300);
		
		 // create four-element Employee array
		 Employee employees [] = new Employee[4];
		
		 // initialize array with Employees
		 employees[0] = salariedEmployee;
		 employees[1] = hourlyEmployee;
		 employees[2] = commissionEmployee;
		 employees[3] = basePlusCommissionEmployee;
		
		 Scanner input = new Scanner(System.in); // to get current month
		 int currentMonth;
		
		 // get and validate current month
		 do {
		System.out.print("Enter the current month (1 - 12): ");
		 currentMonth = input.nextInt();
		 System.out.println();
		 } while ((currentMonth < 1) || (currentMonth > 12));
		
		 System.out.println("Employees processed polymorphically :\n");
		
		 // generically process each element in array employees
		 for (Employee currentEmployee : employees) {
			 System.out.println( currentEmployee ); // invokes toString
		
			 // if month of employee 's birthday , add 100 to salary
			 if (currentMonth == currentEmployee.getBirthDate().getMonth())
				 System.out.printf("earned %,.2f %s\n\n", currentEmployee.earnings(),
						 "plus 100.00 birthday bonus");
			 else
				 System.out.printf( "earned $%,.2f\n\n", currentEmployee.earnings());
		 } 
	}
}
