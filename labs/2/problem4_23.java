// This program reads info and prints a payroll statement.
import java.util.Scanner;

public class problem4_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		
		System.out.print("Enter number of hours worked in a week: ");
		float hours = input.nextFloat();
		
		System.out.print("Enter hourly pay rate: ");
		float payRate = input.nextFloat();
		
		System.out.print("Enter federal tax withholding rate: ");
		float ftwRate = input.nextFloat();
		
		System.out.print("Enter state tax withholding rate: ");
		float stwRate = input.nextFloat();
		
		System.out.print("\nEmployee Name: " + name + "\nHours Worked: " 
		+ hours + "\nPay Rate: $" + payRate + "\nGross Pay: $" + (hours * payRate)
		+ "\nDeductions: \n\tFederal Withholding (" + (ftwRate * 100) + "%): $"
		+ ((hours * payRate) * ftwRate) + "\n\tState Withholding (" + (stwRate * 100)
		+ "%): $" + (hours * payRate) * stwRate + "\n\tTotal Deduction: $" + (hours * payRate)
		* (stwRate + ftwRate) + "\nNet Pay: $" + ((hours * payRate) - ((hours * payRate) 
				* (stwRate + ftwRate))));
	}

}
