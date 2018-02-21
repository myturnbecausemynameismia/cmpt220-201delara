//this program determines whether or not a list is sorted
import java.util.Scanner;

public class problem7_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//list size
		System.out.print("Enter the size of the list: ");
		int size = input.nextInt();
		
		//initiate list
		int[] list;
		list = new int[size];
		
		//list contents
		System.out.print("Enter the contents of the list: ");
		for(int i = 0; i < (size); i++) {
			list[i] = input.nextInt();
		}
		
		//init string
		String integers = "";
		
		//contents into string
		for(int i = 0; i < (size); i++) {
			String n = list[i] + " ";
			integers += n;
		}
		
		System.out.println("The list has " + size + " integers " + integers);
		
		if(isSorted(list))
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");
	}
	
	public static boolean isSorted(int[] list) {
		int min = 0;
		boolean sorted = true;
		for (int i = 0; i < list.length; i++) {
			min = list[i];
			int index = i;
			for(int j = i + 1; j < list.length; j++) {
				if(list[j] < list[i]) {
					min = list[j];
					index = j;
				}
			}
			if(i != index)
				sorted = false;
		}
		return sorted;
	}

}
