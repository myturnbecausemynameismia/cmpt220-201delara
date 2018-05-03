//this program computes the sum of the digits in an integer
import java.util.Scanner;
public class problem18_11 {

	public static void main(String[] args) {
		System.out.print("Enter a positive integer: ");
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		
		System.out.println("The sum of the digits in the integer is " + sumDigits(n));
	}
	
	public static int sumDigits(long n) {
		//base case
		if (n < 10)
			return (int) n;
		else {
			return (int) (n % 10) + sumDigits(n / 10);
		}
	}

}
