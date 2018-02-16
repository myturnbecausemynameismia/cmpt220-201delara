 import java.util.Scanner;
public class pro2_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user
		System.out.print("Enter the number of minutes: ");
		long minutes = input.nextLong();
		
		// Calculate years and remaining days
		long years = minutes / (365 * 24 * 60);
		long days = minutes % (365 * 24 * 60) / (24 * 60);
		
		// Output the result
		System.out.println(minutes + " minutes is approximately "
				+ years + " years and " + days + " days");
	}

}
