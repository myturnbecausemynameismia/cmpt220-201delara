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
		//the following commented out piece works with the other commented out piece in sortedd
		//System.out.println(list);
		System.out.println(list);
		
	}
	public static void sort(ArrayList<Integer> list) {
		ArrayList<Integer> sortedList = new ArrayList<>();
		while (!list.isEmpty()) {
			int min = list.get(0).intValue();
			for(Integer element : list) {
				if (element.intValue() < min)
				min = element.intValue();
			}
			sortedList.add(min);
			list.remove(min);
		}
		list.addAll(sortedList);
		
		//the following works as well
//		int min = 0;
//		int temp;
//		for(int i = 0; i < list.size(); i++) {
//			min = list.get(i);
//			for(int j = i + 1; j < list.size(); j++) {
//				if (list.get(j) < list.get(i)) {
//					min = list.get(j);
//					list.add(i, list.get(j));
//					temp = list.get(i + 1);
//					list.remove(i+1);
//					list.add(j, temp);
//					list.remove(j+1);
//					
//				}
//			}
//		}
	}

}
