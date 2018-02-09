//This program counts the number of positive and negative integers present, excluding 0.
//It also computes the total and average of the integers.
import java.util.Scanner;

public class problem5_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		float sum = 0;
		float n = 0;
		int posNum = 0;
		int negNum = 0;
		int num = 1;
		
		while (num != 0) {
			num = input.nextInt();
			sum += num;
			if (num != 0) {
				n += 1.0;
			}
			if (num > 0) {
				posNum += 1;
			} else if (num < 0) {
				negNum += 1;
			}
		}
		//float ave = (sum / n);

		
		System.out.print("The number of positives is " + posNum
				+ "\nThe number of negatives is " + negNum
				+ "\nThe total is " + sum
				+ "\nThe average is " + sum * (1.0 / n));
	}

}
