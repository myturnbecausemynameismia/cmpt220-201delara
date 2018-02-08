// This program checks to see if a SSN is valid in the form DDD-DD-DDDD
import java.util.Scanner;

public class problem4_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a SSN (ex. DDD-DD-DDDD): ");
		String ssn = input.nextLine();
		
		System.out.println(ssn + isValid(ssn));
	}
	
	private static String isValid(String social) {
		char a = social.charAt(0);
		char b = social.charAt(1);
		char c = social.charAt(2);
		char d = social.charAt(4);
		char e = social.charAt(5);
		char f = social.charAt(7);
		char g = social.charAt(8);
		char h = social.charAt(9);
		char i = social.charAt(10);
	
		if (social.charAt(3) == '-' && social.charAt(6) == '-') {
			if (Character.isDigit(a) && Character.isDigit(b) && Character.isDigit(c)
					&& Character.isDigit(d) && Character.isDigit(e) && Character.isDigit(f)
					&& Character.isDigit(g) && Character.isDigit(h) && Character.isDigit(i)) {
				String result = " is a valid social security number.";
				return result;
			} else {
				String result = " is not a valid social security number.";
				return result;
			}
		} else {
			String result = " is not a valid social security number.";
			return result;
		}
	//	return null;
	}

}
