import java.util.Objects;

public class ColorableTest {

	public static void main(String[] args) {
		GeometricObject[] geometricObjects = {
				new Circle(),
				new Square(),
				new Triangle(),
				new Pentagon(),
				new Hexagon(),
		};
	}

}

class Circle extends GeometricObject implements Colorable{
	int radius;
	
	Circle() {
		radius = 1;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return Math.PI * radius * 2;
	}

	@Override
	public void howToColor() {
		System.out.print("Color entire circumference");
	}
}
class Triangle extends GeometricObject implements Colorable {
	int side1;
	int side2;
	int side3;
	
	Triangle() {
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}
	@Override
	public void howToColor() {
		System.out.print("Color all three sides");
	}

	@Override
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
}
class Pentagon extends GeometricObject implements Colorable{
	int a;
	
	Pentagon() {
		a = 1;
	}
	@Override
	public void howToColor() {
		System.out.print("Color all five sides");
	}

	@Override
	public double getArea() {
		return (1/4) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * (a * a);
	}

	@Override
	public double getPerimeter() {
		return a * 5;
	}
	
}
class Hexagon extends GeometricObject implements Colorable {
	double a;
	
	Hexagon() {
		a = 1;
	}
	
	@Override
	public void howToColor() {
		System.out.print("Color all six sides");
	}

	@Override
	public double getArea() {
		return ((3 * Math.sqrt(3)) / 2) * a * a;
	}

	@Override
	public double getPerimeter() {
		return a * 6;
	}
	
}
