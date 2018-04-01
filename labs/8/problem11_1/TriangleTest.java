import java.util.Scanner;

public class TriangleTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		Triangle triangle = new Triangle();
	
		System.out.print("Enter three sides of a triangle: ");
		triangle.setSide1(input.nextDouble());
		triangle.setSide2(input.nextDouble());
		triangle.setSide3(input.nextDouble());
		
		System.out.print("Enter a color: ");
		triangle.setColor(input.nextLine());
		
		System.out.print("True or False? The triangle is filled. (lowercase only) ");
		triangle.setFilled(input.nextBoolean());
		
		System.out.println("Perimeter: " + triangle.getPerimeter() +
				"\nArea: " + triangle.getArea() + "\nColor: " + triangle.getColor()
				+ "Is Filled: " + triangle.isFilled());
		
		
	}
	
}
