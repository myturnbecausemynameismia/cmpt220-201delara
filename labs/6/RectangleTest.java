
public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		rectangle1.createRectangle(4, 40);
		rectangle1.getArea();
		rectangle1.getPerimeter();
		
		Rectangle rectangle2 = new Rectangle();
		rectangle2.createRectangle(3.5, 35.9);
		rectangle2.getArea();
		rectangle2.getPerimeter();
		
		System.out.println("Rectangle1\nWidth: " + rectangle1.width + "\nHeight: " + rectangle1.height + 
				"\nArea: " + rectangle1.getArea() + "\nPerimeter: " + rectangle1.getPerimeter());
		
		System.out.println("\nRectangle2\nWidth: " + rectangle2.width + "\nHeight: " + rectangle2.height + 
				"\nArea: " + rectangle2.getArea() + "\nPerimeter: " + rectangle2.getPerimeter());
	}

}
