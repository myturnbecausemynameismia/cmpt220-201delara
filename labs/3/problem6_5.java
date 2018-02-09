// This program displays three given numbers in increasing order
import java.util.Scanner;

public class problem6_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		
		displaySortedNumbers(n1, n2, n3);
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		if ((num1 > max(num2, num3)) && (num2 == max(num2, num3))) 
			System.out.print(num3 + ", " + num2 + ", " + num1);
		
		else if ((num1 > max(num2, num3)) && (num3 == max(num2, num3)))
			System.out.print(num2 + ", " + num3 + ", " + num1);
		
		else if ((num2 > max(num1, num3)) && (num1 == max(num1, num3)))
			System.out.print(num3 + ", " + num1 + ", " + num2);
		
		else if ((num2 > max(num1, num3)) && (num3 == max(num1, num3)))
			System.out.print(num1 + ", " + num3 + ", " + num2);
		
		else if ((num3 > max(num2, num1)) && (num1 == max(num2, num1)))
			System.out.print(num2 + ", " + num1 + ", " + num3);
		
		else if ((num3 > max(num2, num1)) && (num2 == max(num2, num1)))
			System.out.print(num1 + ", " + num2 + ", " + num3);
	}
	
	private static double max(double a, double b) {
		double max;
		if (a > b) 
			max = a;
		else
			max = b;
		
		return max;
	}

}
