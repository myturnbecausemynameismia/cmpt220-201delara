//This program displays a matrix with the characters H and T corresponding to a given number
import java.util.Scanner;

public class problem8_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 511: ");
		int n = input.nextInt();
		
		//convert to binary
		String binary = Integer.toBinaryString(n);
		
		//remaining num out of 9
		int remain = 9 - binary.length();
		
		String wholeBinary = "";
		for(int i = 0; i < remain; i++) {
			wholeBinary += "0";
		}
		wholeBinary += binary;
		
		//create matrix
		String[][] matrix = new String[3][3];
		
		int x = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				
				if(wholeBinary.charAt(x) == '0')
					matrix[i][j] = "H";
				else
					matrix[i][j] = "T";
				x += 1;
			}
		}
		for(int i = 0; i < 3; i++) {
			System.out.println(matrixToString(matrix, i));
		}
		
	}
	public static String matrixToString(String[][] matrix, int row) {
		//init string
		String m = "";
		
		for(int i = 0; i < 3; i++) {
			String num = matrix[row][i] + " ";
			m += num;
			
		}
		return m;
	}

}
