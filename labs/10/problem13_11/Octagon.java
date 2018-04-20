

public class Octagon extends GeometricObject implements Comparable<Octagon>,
		Cloneable {
	
	private double side;
	
	Octagon(){
		this.side = 0;
	}
	
	Octagon(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	@Override
	public double getPerimeter() {
		return side * 8;
	}

	@Override
	public int compareTo(Octagon o) {
		if(this.side > o.side)
			return 1;
		else if (this.side < o.side)
			return -1;
		else
			return 0;
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch(CloneNotSupportedException ex) {
			return null;
		}
	}

}
