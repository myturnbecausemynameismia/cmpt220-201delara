import java.text.SimpleDateFormat;
import java.util.Date;

public class problem9_3 {

	public static void main(String[] args) {
		long milliseconds = System.currentTimeMillis();
		//SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy HH:mm");   
		
		
		Date resultdate = new Date(milliseconds);
		System.out.println("Today's date is " + resultdate.toString());
		//sdf.format(resultdate));
		
        for(long i = 100; i < (100000 * 100000); i *= 10) { // could do i < 100000000000L;
			Date newDate = new Date(milliseconds + i * 100);
			System.out.println("The elapsed date (with elapsed time of " + i +
					"00) is " +  newDate.toString());
					//sdf.format(newDate));
		}

	}

}
