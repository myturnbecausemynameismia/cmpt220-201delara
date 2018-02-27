import java.util.Scanner;

public class LinearEquationTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the values of a, b, c, d, e, and f respectively: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		LinearEquation linearEq = new LinearEquation(a, b, c, d, e, f);
		
		if(linearEq.isSolvable())
			System.out.print("x is " + linearEq.getX() + "\ny is " +linearEq.getY());
		
		else
			System.out.print("The equation has no solution");
		
	}

}
