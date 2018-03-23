import java.util.Scanner;

public class problem10_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		
		int n = input.nextInt();
		
		StackOfIntegers stack = new StackOfIntegers();
		
		int subN = n;
		
		
		String list = "";
		
		while(subN % 11 == 0) {
			if(subN % 11 == 0) {
				subN /= 11;
				//list += "11 ";
				stack.push(11);
			}
		}
		
		
		while(subN % 7 == 0) {
			if(subN % 7 == 0) {
				subN /= 7;
				stack.push(7);
			}
		}
		
		while(subN % 5 == 0) {
			if(subN % 5 == 0) {
				subN /= 5;
				stack.push(5);
			}
		}
		
		while(subN % 3 == 0) {
			if(subN % 3 == 0) {
				subN /= 3;
				stack.push(3);
			}
		}
		
		while(subN % 2 == 0) {
			if(subN % 2 == 0) {
				subN /= 2;
				stack.push(2);
			}
		}
		
		for(int i = 0; i < 16; i++) {
			if(stack.getElements()[i] != 0)
				list += stack.getElements()[i] + " ";
		}
		
		System.out.print("The factors are " + list );
	}

}
