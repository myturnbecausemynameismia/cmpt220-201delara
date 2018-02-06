//This program is an Addition quiz
import java.util.Scanner;

public class problem3_2 {

	public static void main(String[] args) {
		int num1 = (int)(System.currentTimeMillis() % 10);
		int num2 = (int)(System.currentTimeMillis() / 10 % 10);
		int num3 = (int)(Math.random() * 11);
		
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print(
				"What is " + num1 + " + " + num2 + " + " + num3 + "? ");
		
		int answer = input.nextInt();
		
		System.out.println(
				num1 + " + " + num2 + " + " + num3 + " = " + answer + " is " +
		(num1 + num2 + num3 == answer));
	}

}
