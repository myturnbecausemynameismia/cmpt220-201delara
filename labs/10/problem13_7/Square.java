
public class Square extends GeometricObject implements Colorable {
	private double side;
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	Square(){
		side = 0;
	}
	
	Square(double side) {
		this.side = side;
	}
	
	@Override
	public void howToColor() {
		System.out.println("Color all four sides");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}