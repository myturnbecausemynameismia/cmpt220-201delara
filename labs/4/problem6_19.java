//This program takes three sides of a triangle, determines if the sides are valid, 
	//and calculates the area
import java.util.Scanner;

public class problem6_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of side 'a' of the triangle: ");
		double a = input.nextDouble();
		
		System.out.print("Enter the length of side 'b' of the triangle: ");
		double b = input.nextDouble();
		
		System.out.print("Enter the length of side 'c' of the triangle: ");
		double c = input.nextDouble();
		
		if (isValid(a, b, c))
			System.out.print("The area of the triangle is " + area(a, b, c));
		else
			System.out.print("That's not a valid triangle");
	}
	
	/** Return true if the sum of every two sides is greater than the third side. */
	public static boolean isValid(double side1, double side2, double side3) {
		if(((side1 + side2) > side3) && ((side2 + side3) > side1) && ((side1 + side3) > side2))
			return true;
		else
			return false;
	}
	
	/** Return the area of the triangle */
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3)/2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

}
