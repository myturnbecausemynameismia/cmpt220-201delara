package sd;

//This program reads 10 given numbers, displays the number of distinct numbers, and displays
	//them in order inputed
import java.util.Scanner;

public class problem7_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		int[] a;
		a = new int[9];
		
		int[] nums;
		nums = new int[9];
		
		boolean[] d;
		d = new boolean[9];
		for(int i = 0; i < 9; i++) {
			d[i] = false;
		}
		
		String distinctNum = "";
		int numOfDistinct = 0;
		
		for(int j = 0; j < 9; j++){
			int num = input.nextInt();
			nums[j] = num;
			String n = nums[j] + " ";
			
			for(int i = 0; i < 9; i++) {
				if ((d[i] == true) && (nums[j] == a[i])){
					break;
				}
			
				else if(d[i]==false){
					a[i] = nums[j];
					d[i] = true;
					distinctNum += n;
					numOfDistinct += 1;
					break;
				}
			}
		}
		
		System.out.println("The number of distinct numbers is " + numOfDistinct);
		System.out.println("The distinct numbers are: " + distinctNum);
	
			
	}

}