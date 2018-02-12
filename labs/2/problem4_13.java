//This program determines whether a letter is a vowel or a consonant
import java.util.Scanner;

public class problem4_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		String letter = input.nextLine();
		
	    if (letter.length() == 1){
			System.out.print("\"" + letter + "\"" + " is " + check(letter));
	        }
	        else
	        System.out.println("One character at a time please.");
	}
	
	private static String check(String character) {
		char ch = character.charAt(0);
		ch = Character.toLowerCase(ch); // JA

		if (Character.isLetter(ch) != true) {
			String result = "an invalid input.";
			return result;
		}
		else if (ch == 'a' || ch == 'i' || ch == 'u'
				|| ch == 'e' || ch == 'o') { // JA
			String result = "a vowel.";
			return result;
		} else {
			String result = "a consonant.";
			return result;
		}
		//return (String) null;
	}

}
