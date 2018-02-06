// This program finds future dates
import java.util.Scanner;

public class problem3_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Using an integer, "
				+ "what is the day of the week? (ex. Sunday - 0, Monday - 1) ");
		int todayNum = input.nextInt();
		
		System.out.print("How many days will elapse since today? ");
		int numDays = input.nextInt();
		
		int futDayNum = (todayNum + 1 + numDays) % 7 - 1;
		
		System.out.println("Today is " + dayOfWeek(todayNum) + " and the future day is "
				+ dayOfWeek(futDayNum));
		
	}
	
	private static String dayOfWeek(int day) {
		if (day == 0) {
			String dayOfWeek = "Sunday";
			return dayOfWeek;
		} else if (day == 1) {
			String dayOfWeek = "Monday";
			return dayOfWeek;
		} else if (day == 2) {
			String dayOfWeek = "Tuesday";
			return dayOfWeek;
		} else if (day == 3) {
			String dayOfWeek = "Wednesday";
			return dayOfWeek;
		} else if (day == 4) {
			String dayOfWeek = "Thursday";
			return dayOfWeek;
		} else if (day == 5) {
			String dayOfWeek = "Friday";
			return dayOfWeek;
		} else if (day == 6) {
			String dayOfWeek = "Saturday";
			return dayOfWeek;
		}
		return null;
	}

}
