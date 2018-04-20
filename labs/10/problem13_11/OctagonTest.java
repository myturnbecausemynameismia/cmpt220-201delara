
public class OctagonTest {

	public static void main(String[] args) {
		Octagon octagon = new Octagon(5);
		
		System.out.println("The area of the octagon is " + octagon.getArea());
		System.out.println("The perimeter of the octagon is " + octagon.getPerimeter());
		
		Octagon clone = (Octagon) octagon.clone();
		
		System.out.println("Is the octagon and it's clone the same? " + 
		octagon.compareTo(clone));
		
	}

}
