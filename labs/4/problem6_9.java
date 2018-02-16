
public class problem6_9 {

	public static void main(String[] args) {
		System.out.printf("%-10s%-10s | %10s%10s\n", 
				"Feet" , "Meters", "Meters", "Feet");	
		for(double i = 1.0, j = 20.0; i <= 10.0; i++, j += 5.0) {
			System.out.printf("%-10s%-10s | %10s%10s\n", 
					i, footToMeter(i), j, meterToFoot(j) );	
	}
	}
	
	/** Convert from feet to meters */
	public static double footToMeter(double foot) {
		double footToMeter = 0.305 * foot;
		return footToMeter;
	}
	
	/** Convert from meters to feet */
	public static double meterToFoot(double meter) {
		double meterToFoot = 3.279 * meter;
		return meterToFoot;
	}

}
