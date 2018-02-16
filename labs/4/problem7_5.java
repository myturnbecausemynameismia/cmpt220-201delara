//This prgram reads 10 given numbers, displays the number of distinct numbers, and displays
	//them in order inputed
import java.util.Scanner;

public class problem7_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		int[] a;
		a = new int[10];
		boolean[] d;
		d = new boolean[10];
		
		int num = input.nextInt();
		String distinctNum = "";
		int numOfDistinct = 11;
		
		for(int i = 0; i <= 9; i++) {
			d[i] = true;
		}

		
		for(int i = 0; i <= 9; i++) {
			a[i] = num;
			String n = a[i] + " ";
			if(d[i] == true) {
				distinctNum += n;
				d[i] = false;
			}
			for(int j = 0; j <= 9; j++) {
				if((i != j) && (num == a[j])) {
					numOfDistinct -= 1;

				}
			}

			num = input.nextInt();
		}
		
		
		System.out.println("The number of distinct numbers is " + numOfDistinct);
		System.out.println("The distinct numbers are: " + distinctNum);
	
			
	}

}
