//counts the number of occurrences of a letter in a string/
// ** this is case-sensitive

import java.util.Scanner;

public class problem18_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the text to match: ");
		String text = input.nextLine();
		System.out.print("Enter a character to count occurences of: ");
		char ch = input.nextLine().charAt(0);
		
		System.out.println("The character appears " + count(text, ch) + " times");
	}
	
	public static int count(String str, char a) {
		return count(str, a, 0);	
	}
	
	public static int count(String str, char a, int high) {
		//base case
		if (high == str.length())
			return 0;
		else
			return (str.charAt(high) == a? 1 : 0) + count(str, a, high + 1);
	}
}
