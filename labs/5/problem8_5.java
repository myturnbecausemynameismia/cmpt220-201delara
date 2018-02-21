//this program tests a method that adds two matrices
import java.util.Scanner;

public class problem8_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//matrix1
		double[][] matrix1 = new double[3][3];
		
		System.out.println("Enter matrix1: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix1[i][j] = input.nextDouble();
			}
		}
		
		//matrix2
		double[][] matrix2 = new double[3][3];
		
		System.out.println("Enter matrix2: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix2[i][j] = input.nextDouble();
			}
		}
		
		System.out.println("The matrices are added as follows");

		String plus;
		String equal;
		for(int i = 0; i < 3; i++) {
			if(i == 1) {
				plus = "+";
				equal = "=";
			}
			else {
				plus = " ";
				equal = " ";
			}
			System.out.printf("%-7s%2s  %7s%2s  %7s\n", matrixToString(matrix1, i), plus, 
					matrixToString(matrix2, i), equal, matrixToString(addMatrix(matrix1,matrix2), i));
		}
		
	}
	
	public static double[][] addMatrix(double[][] a, double[][] b) {
		//init new matrix
		double[][] sum = new double[3][3];
		
		//add the two matrices
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		return sum;
	}
	
	public static String matrixToString(double[][] matrix, int row) {
		//init string
		String m = "";
		
		for(int i = 0; i < 3; i++) {
			String num = matrix[row][i] + " ";
			m += num;
			
		}
		return m;
	}

}
