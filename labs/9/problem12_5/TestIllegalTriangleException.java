
public class TestIllegalTriangleException {

	public static void main(String[] args) {
		try {
			Triangle t1 = new Triangle(1, 1, 1);
			Triangle t2 = new Triangle(1, 2, Math.sqrt(3));
			Triangle t3 = new Triangle(-1, 0, 3);
			Triangle t4 = new Triangle(7, 2, 3);
		} catch(IllegalArgumentException e) {
			System.out.println(e);
		} catch(IllegalTriangleException e) {
			System.out.println(e);
		}
		
		System.out.println("Number of triangles created: " + Triangle.getNumObjects());
	}

}
