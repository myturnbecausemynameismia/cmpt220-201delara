//This program finds two points in a 3-dimensional space nearest to eachother

public class problem8_7 {

	public static void main(String[] args) {
		double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
				{2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
				{5.5, 4, -0.5}};
		
		//p1 & p2 are indices in the points' array
		int p1 = 0, p2 = 1; //initial two points
		double shortestDistance = distance(points[p1], points[p2]); //initialize shortest distance
		
		//compute distance for every two points
		for(int i = 0; i < points.length; i++) {
			for(int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i], points[j]); //find distance
				
				if(shortestDistance > distance) {
					p1 = i; //update p1
					p2 = j; //update p2
					shortestDistance = distance; //update shortest distance
				}
			}
		}
		
		System.out.println("The closest two points are " + coord(points[p1]) + 
				" and " + coord(points[p2]));
	}
	
	public static double distance(double[] p1, double[] p2) {
		double radicand = 0;
		
		for(int i = 0; i < 3; i++) {
			radicand += (double) Math.pow((p1[i] - p2[i]), 2);
		}
		return (double) Math.sqrt(radicand);
	}
	
	public static String coord(double[] point) {
		String coordinate = "(";
		for(int i = 0; i < 3; i++) {
			coordinate += point[i];
			if(i < 2)
				coordinate += ", ";
		}
		coordinate += ")";
		return coordinate;

	}

}
