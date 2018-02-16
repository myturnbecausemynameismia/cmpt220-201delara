//This program reads integers between 1 and 100 and counts the occurance of each
import java.util.Scanner;

public class problem7_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integers between 1 and 100 (input ends if you enter 0): ");
		int[] a;
		a = new int[100];
		int num = input.nextInt();
		
		while(num != 0) {
			a[num - 1] += 1;
			num = input.nextInt();
		}
		
		for(int i = 0; i < 100; i++) {
			String plOrSingle = "";
			if(a[i] == 1)
				plOrSingle = " time.";
			else
				plOrSingle = " times.";
			if(a[i] != 0)
				System.out.println((i+1) + " occurs " + a[i] + plOrSingle);
		}
	}

}
