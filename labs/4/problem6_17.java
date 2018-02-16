//this program displays a random n x n matrix of 0s and 1s
import java.util.Scanner;

public class problem6_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		final int CHARS_PER_LINE = n;
		String s = "";
		for(int i = 1; i <= (n * n); i++) {
			int number = (int)(Math.random() * 2);
			s =+ number + " ";
			System.out.print(s);
			if(i % CHARS_PER_LINE == 0)
				System.out.print("\n");
		}
	}

}
