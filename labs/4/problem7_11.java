//mean and standard deviation
package sd;
import java.util.Scanner;
public class problem7_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		double[] x;
		x = new double[9];
		
		for(int i = 0; i < 9; i++){
			x[i] = input.nextDouble();
		}
		
		System.out.printf("The mean is %.3f\n", mean(x));
		System.out.printf("The standard deviation is %.3f\n", deviation(x));
	}
	
	/** Compute the deviation of double values */
	public static double deviation(double[] x){
		double sum = 0;
		for(int i = 0; i < 9; i++){
			sum += (x[i] - mean(x)) * (x[i] - mean(x));
		}
		double deviation = Math.sqrt(sum / (x.length - 1));
		return deviation;
	}
	
	/** Compute the mean of an array of double values */
	public static double mean(double[] x){
		double sum = 0;
		for(int i = 0; i < 9; i++){
			sum += x[i]; 
		}
		double mean = sum / (x.length);
		return mean;
	}

}
