
public class Location {
	public static int row;
	public static int column;
	public static double maxValue;
	
	Location(){}
	
	public static Location locateLargest(double[][] a) {
		Location location = new Location();
		location.maxValue = a[0][0];
		location.row = a.length;
		location.column = a[0].length;
		for(int i = 0; i < row; i ++) {
			for(int j = 0; j < column; j++) {
				if(maxValue < a[i][j]) 
					location.maxValue = a[i][j];
			}
		}
		for(int i = 0; i < row; i ++) {
			for(int j = 0; j < column; j++) {
				if(location.maxValue == a[i][j]) {
					location.row = i;
					location.column = j;
				}
			}
		}
		return location;
		
	}

}
