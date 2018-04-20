import java.util.ArrayList;

public class problem13_3 {
	public static void main(String[] args) {
		
		
	}
	
	public static void sort(ArrayList<Number> list) {
		ArrayList<Number> sortedList = new ArrayList<>();
		int listSize = list.size();
		while (!list.isEmpty()) {
			Number min = list.get(0);
			for(int i = 1; i < listSize; i++) {
				if (list.get(i).doubleValue() < min.doubleValue()) {
					min = list.get(i).doubleValue();
				}
			}
			sortedList.add(min);
			list.remove(min);
		}
		list.addAll(sortedList);

	}

}
