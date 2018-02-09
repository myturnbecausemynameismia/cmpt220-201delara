// This program displays the first 100 pentagonal numbers
public class problem6_1 {

	public static void main(String[] args) {
		final int CHARS_PER_LINE = 10; //notes say == so keep in mind
		for (int i = 1; i < 101; i++) {
			System.out.printf("%7d", getPentagonalNumber(i));
			if (i % CHARS_PER_LINE == 0)
				System.out.print("\n");
		}
	}
	
	public static int getPentagonalNumber(int n) {
		int pentagonalNumber = (n * (3 * n - 1)) / 2;
		return (Integer) pentagonalNumber;
	}

}
