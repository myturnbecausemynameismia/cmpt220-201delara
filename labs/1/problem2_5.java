// This program reads subtotal and gratuity rate, then calculates total and gratuity
import java.util.Scanner;

public class problem2_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the subtotal: ");
		double subtotal = input.nextDouble();
		
		System.out.println("Enter the gratuity rate: ");
		double rate = input.nextDouble();
		
		double gratuity = subtotal * (rate / 100.0);
		double total = subtotal + gratuity;
		System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);

	}

}
