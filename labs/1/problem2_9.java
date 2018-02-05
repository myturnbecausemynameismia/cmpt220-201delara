//This program calculates average acceleration using initial and final velocity and time
import java.util.Scanner;
public class problem2_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter initial velocity (in m/s): ");
		double initVel = input.nextDouble();
		
		System.out.print("Enter final velocity (in m/s): ");
		double finalVel = input.nextDouble();
		
		System.out.print("How many seconds did it take for the velocity to change? ");
		double time = input.nextDouble();
		
		double acceleration = (finalVel - initVel) / time;
		
		System.out.println("The average acceleration is " + 
		(int)(acceleration*10000)/10000.0 + " m/s^2.");
	}

}
