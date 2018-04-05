//this program creates an array with 100 random integers, prompts the user to enter
//an index of an array and then reveals the value in the index, and also displays
//"Out of Bounds" if the index is out of bounds

import java.util.Scanner;

public class problem12_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//create the array
		int[] array = new int[100];
		for(int i = 0; i < array.length; i ++) {
			array[i] = (int) (Math.random() * 100);
		}
		
		System.out.print("Enter an index of the array: ");
		
		int index = input.nextInt();
		
		try {
			System.out.print("The value at index " + index + " is " + array[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("Out of Bounds");
		}
	}

}
