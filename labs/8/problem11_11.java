//this program sorts an ArrayList
import java.util.ArrayList;
import java.util.Scanner;

public class problem11_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 integers: ");
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}
		
		sort(list);
		System.out.println("The numbers in increasing order are as follows: ");
		System.out.println(list);
		
	}
	public static void sort(ArrayList<Integer> list) {
		int min = 0;
		int temp;
		for(int i = 0; i < list.size(); i++) {
			min = list.get(i);
			for(int j = i + 1; j < list.size(); j++) {
				if (list.get(j) < list.get(i)) {
					min = list.get(j);
					list.add(i, list.get(j));
					temp = list.get(i + 1);
					list.remove(i+1);
					list.add(j, temp);
					list.remove(j+1);
					
				}
			}
		}
	}

}
