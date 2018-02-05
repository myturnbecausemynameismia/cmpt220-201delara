//This program will convert fahrenheit to celcius
import java.util.Scanner;
public class problem2_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a temperature value in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		double celcius = (fahrenheit - 32) * (5.0 / 9.0);
		
		System.out.println("The temperature in Celcius is: " + (int)(celcius * 100)/100.0);
	}

}
