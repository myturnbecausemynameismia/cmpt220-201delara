//this program displays the current year month and day and another thing
import java.util.GregorianCalendar;

public class problem9_5 {

	public static void main(String[] args) {
		GregorianCalendar today = new GregorianCalendar();
		today.get(GregorianCalendar.YEAR);
		today.get(GregorianCalendar.MONTH);
		today.get(GregorianCalendar.DAY_OF_MONTH);
		
		System.out.println("Today is " + (today.get(GregorianCalendar.MONTH) + 1) + "/" +
				today.get(GregorianCalendar.DAY_OF_MONTH) + "/" + 
				today.get(GregorianCalendar.YEAR) + ".");
		
		long elapsedTime = 1234567898765L;
		today.setTimeInMillis(elapsedTime);
		
		System.out.println("The date from 1/1/1970 with elapsed time of " + elapsedTime + " is " +
				(today.get(GregorianCalendar.MONTH) + 1) + "/" +
				today.get(GregorianCalendar.DAY_OF_MONTH) + "/" + 
				today.get(GregorianCalendar.YEAR) + ".");
	}

}
