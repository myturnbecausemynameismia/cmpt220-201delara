//This program reads 10 given numbers and displays
	//the distinct numbers in the order inputed
import java.util.Scanner;

public class problem7_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		int[] nums;
		nums = new int[9];
		
		for(int j = 0; j < 9; j++){
			int num = input.nextInt();
			nums[j] = num;
		}
		
		String distinctNum = "";
		String n = "";
		
		for(int i = 0; i < (eliminateDuplicates(nums).length - 1); i++) {
			n = eliminateDuplicates(nums)[i] + " ";
			distinctNum += n;
		}
		
		System.out.println("The distinct numbers are: " + distinctNum);
	
			
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		int[] a;
		a = new int[9];
		
		boolean[] d;
		d = new boolean[9];
		for(int i = 0; i < 9; i++) {
			d[i] = false;
		}
		

		
		for(int j = 0; j < 9; j++){
			for(int i = 0; i < 9; i++) {
				if ((d[i] == true) && (list[j] == a[i])){
					break;
				}
			
				else if(d[i]==false){
					a[i] = list[j];
					d[i] = true;
					break;
				}
			}
		}
		int length = 1;
		
		//find length of new array
		for(int i = 0; i < 9; i++) {
			if(d[i] == true)
				length += 1;	
		}
		int[] newArray;
		newArray = new int[length];
		
		for(int i = 0; i < (length); i++) {
			newArray[i] = a[i];
		}
		return newArray;
	}

}