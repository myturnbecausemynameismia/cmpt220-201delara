//This program gives the number of days in a month in a certain year
import java.util.Scanner;

public class problem3_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of the month: ");
		int monthNum = input.nextInt();
		
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		
		//Show month name and days
		System.out.print(month(monthNum) + year + " has " + numDays(monthNum, year)
		+ " days.");
	}
	
	private static String month(int numberMonth) {
		if (numberMonth == 1) {
			String month = "January ";
			return month;
		} else if (numberMonth == 2) {
			String month = "February ";
			return month;
		} else if (numberMonth == 3) {
			String month = "March ";
			return month;
		} else if (numberMonth == 4) {
			String month = "April ";
			return month;
		} else if (numberMonth == 5) {
			String month = "May ";
			return month;
		} else if (numberMonth == 6) {
			String month = "June ";
			return month;
		} else if (numberMonth == 7) {
			String month = "July ";
			return month;
		} else if (numberMonth == 8) {
			String month = "August ";
			return month;
		} else if (numberMonth == 9) {
			String month = "September ";
			return month;
		} else if (numberMonth == 10) {
			String month = "October ";
			return month;
		} else if (numberMonth == 11) {
			String month = "November ";
			return month;
		} else if (numberMonth == 12) {
			String month = "December ";
			return month;
		}
		return null;
		
	}
	
	private static int numDays(int numberMonth, int year) {
		if (numberMonth <= 7) {
			if (numberMonth == 2) {
				if (year % 4 == 0) {
					int numDays = 29;
					return numDays;
				} else {
					int numDays = 28;
					return numDays;
				}
			} else if (numberMonth % 2 == 0) {
				int numDays = 30;
				return numDays;
			} else {
				int numDays = 31;
				return numDays;
			}
		} else if (numberMonth > 7) {
			if (numberMonth % 2 == 0) {
				int numDays = 31;
				return numDays;
			} else {
				int numDays = 30;
				return numDays;
			}
		}
		return (Integer) null;
	}

}
