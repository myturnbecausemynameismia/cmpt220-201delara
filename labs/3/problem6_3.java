//This program determines whether or not a given number is a palindrome
import java.util.Scanner;

public class problem6_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		if (isPalindrome(num)) {
			System.out.print(num + " is " + "a palindrome.");
		} else {
			System.out.print(num + " is " + "not a palindrome.");
		}
	}
	
	public static int reverse(int number) {
		String s = number + "";
		String reverse = "";
		for (int j = (s.length() - 1); j >= 0; j--) {
			reverse += s.charAt(j);
		}
		return Integer.parseInt(reverse); //<<returns the reverse string (converted into an int)
	}
	
	public static boolean isPalindrome(int number) {
		return number==reverse(number);
	}

}
