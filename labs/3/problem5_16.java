//This program finds all the smallest factors in an increasing order of a given integer
import java.util.Scanner;

public class problem5_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: " );
		int num = input.nextInt();
		String statement = "All the factors of " + num + " are: ";
		
		
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) { // JA
				statement += i + " ";
				num /= i;
			}
		}
		System.out.print(statement);
		
	}

}
