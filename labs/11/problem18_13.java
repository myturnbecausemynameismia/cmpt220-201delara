//finds the largest number in an array
import java.util.ArrayList;
import java.util.Scanner;
public class problem18_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a list of 8 positive integers: ");
		int[] array = new int[8];
		for(int i = 0; i < 8; i++) {
			array[i] = input.nextInt();
		}
		
		System.out.println("The largest number in the array is " + largest(array));
	}
	//vv works alone but not efficient
//	public static int largest(int[] array) {
//		//base case
//		if (array.length == 1)
//			return array[0];
//		
//		//make 2nd array that has one less than first array
//		int[] array2 = new int[array.length - 1];
//		for (int i = 0; i < array2.length; i++) {
//			array2[i] = array[i+1];
//		}
//		return Math.max(array[0], largest(array2));
//	}
	
	public static int largest(int[] array) {
		return largest(array, 0);
	}
	
	public static int largest(int[] array, int index) {
		if (index == array.length - 1)
			return array[index];
		return Math.max(array[index], largest(array, index + 1));
	}

}
