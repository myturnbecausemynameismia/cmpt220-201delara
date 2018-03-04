
public class Rectangle {

	double width = 1;
	double height = 1;
	
	Rectangle() {
		width = 1;
		height = 1;
	}
	
	public void createRectangle(double width, double height) {
		if((width > 0) && (height > 0)) {
			this.width = width;
			this.height = height;
		}
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * width + 2 * height;
	}
	
	
	

}
