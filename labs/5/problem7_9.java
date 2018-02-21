package sd;
import java.util.Scanner;
public class problem7_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		
		double[] nums;
		nums = new double[9];
		
		for(int i = 0; i < 9; i++) {
			nums[i] = input.nextDouble();
		}
		
		System.out.print("\nThe minimum number is " + min(nums));
	}
	
	public static double min(double[] array){
		sort(array);
		return array[0];
		
	}
	
	public static void sort(double[] a) {
		double min = 0;
		for (int i = 0; i < a.length; i++) {
			min = a[i];
			int index = i;
			for(int j = i + 1; j < a.length; j++) {
				if(a[j] < a[i]) {
					min = a[j];
					index = j;
				}
			}
			if(i != index)
				swap(a, i ,index);
		}
	}
	
	public static void swap(double[] a, int i, int j) {
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
		
	

}
