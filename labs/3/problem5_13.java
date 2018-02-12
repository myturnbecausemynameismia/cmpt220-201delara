
public class problem5_13 {

	public static void main(String[] args) {
		int n = 0;
		while ((n * n * n) < 12000) {
			n += 1;
		}
		n--; // JA
		System.out.print("The largest value for n such that n^3 is less that 12,000 is " + n);
	}

}
