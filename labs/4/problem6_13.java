//this program shows a given summation
public class problem6_13 {

	public static void main(String[] args) {
		System.out.printf("%-8s%8s\n________________\n", "i", "m(i)");
		for(double i = 1; i<=20; i++) {
			System.out.printf("%-8s%8.4f\n", i, summation(i));
		}
	}
	public static double summation(double i) {
		double m = (i / (i + 1));
		for(double num = 1, den = 2; num < i; num ++, den++) {
			m += (num/den);
		}
		return m;
	}

}
