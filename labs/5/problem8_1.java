//This program returns the sum of al the elements in a specified column in a matrix
import java.util.Scanner;

public class problem8_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row:");
		
		//initializ matrix
		double[][] matrix = new double[3][4];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		for(int i = 0; i < 4; i++) {
			System.out.println("The sum of the elements at column " + i + " is " + 
		sumColumn(matrix, i));
		}
	}
	
	public static double sumColumn(double[][] m, int columnIndex) {
		//init sum
		double sum = 0;
		
		//find sum
		for(int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		
		return sum;
	}

}
