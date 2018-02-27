import java.util.Scanner;

public class LocationTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		
		Location loc = new Location();
		loc.row = input.nextInt();
		loc.column = input.nextInt();
		
		System.out.println("Enter the array:");
		
		double[][] array = new double[loc.row][loc.column];
		
		for(int i = 0; i < loc.row; i++) {
			for(int j = 0; j < loc.column; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		
		System.out.println("The location of the largest element is " + loc.locateLargest(array).maxValue +
				" at (" + loc.locateLargest(array).row + ", " + loc.locateLargest(array).column + ")");
		
	}

}
