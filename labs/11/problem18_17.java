//counts the number of occurrences of a letter in a string/
// ** this is case-sensitive

import java.util.Scanner;

public class problem18_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a list of characters: ");
		String text = input.nextLine();
		
		char[] chars = new char[text.split(" ").length];
		
		String[] strings = text.split(" ");
		for(int i = 0; i < strings.length; i++)
			chars[i] = strings[i].charAt(0);
		
		System.out.print("Enter a character to count occurences of: ");
		char ch = input.nextLine().charAt(0);
		
		System.out.println("The character appears " + count(chars, ch) + " times");
	}
	
	public static int count(char[] chars, char ch) {
		return count(chars, ch, 0);	
	}
	
	public static int count(char[] chars, char ch, int high) {
		//base case
		if (high == chars.length)
			return 0;
		else
			return (chars[high] == ch? 1 : 0) + count(chars, ch, high + 1);
	}
}
