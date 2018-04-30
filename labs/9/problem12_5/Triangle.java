//HELP
// JA: Where is the GeometricObject class?
public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private static double numObjects = 0;
	
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) 
			throws IllegalTriangleException {
		if(side1 >= 0)
			this.side1 = side1;
		else
			throw new IllegalTriangleException(side1, side2, side3);
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2)  
			throws IllegalTriangleException {
		if(side2 >= 0)
			this.side2 = side2;
		else
			throw new IllegalTriangleException(side1, side2, side3);
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3)  
			throws IllegalTriangleException {
		if(side3 >= 0)
			this.side3 = side3;
		else
			throw new IllegalTriangleException(side1, side2, side3);
	}

	public Triangle() throws IllegalTriangleException {
		this.side1 = 1;
		this.side2 = 2;
		this.side3 = 3;
		numObjects++;
	}
	
	public static double getNumObjects() {
		return numObjects;
	}

	public Triangle(double side1, double side2, double side3) 
			throws IllegalTriangleException {
		if(side1 > 0 && side2 > 0 && side3 > 0 && ((side1 + side2 > side3) && 
				(side2 + side3 > side1) && (side3 + side1 > side2))) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
			numObjects++;
		}
		else
			throw new IllegalArgumentException("Sides cannot be negative and the"
					+ " sum of two sides must be larger than the third side.");
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
	
	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
	}
	

}
