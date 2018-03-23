

public class Circle2D {
	double x;
	double y;
	double radius;
	
	Circle2D() {
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	
	Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		if(radius > 0)
			this.radius = radius;
	}
	
	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}
	
	public double getPerimeter() {
		return 3.14 * 2 * this.radius;
	}
	
	public boolean contains(double x, double y) {
		return this.radius > ((double) (Math.sqrt(Math.pow(this.x - x, 2) + 
				Math.pow(this.y - y, 2))));
	}
	
	public boolean contains(Circle2D circle) {
		return this.radius > ((double) (Math.sqrt(Math.pow(this.x - circle.x, 2) + 
				Math.pow(this.y - circle.y, 2))) + circle.radius);
	}
	
	public boolean overlaps(Circle2D circle) {
		return this.radius > ((double) (Math.sqrt(Math.pow(this.x - circle.x, 2) + 
				Math.pow(this.y - circle.y, 2))) - circle.radius);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
	
}
