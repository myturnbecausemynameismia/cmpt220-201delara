//test
public class clientProgram {

	public static void main(String[] args) {
		MyInteger a = new MyInteger();
		a.value = 3;
		a.getValue();
		System.out.println(a.isEven() + " " + a.isOdd() + " " + a.isPrime());
		
		System.out.println(a.isEven(5) + " " + a.isOdd(5) + " " + a.isPrime(5));
		
		System.out.println(a.isEven(a) + " " + a.isOdd(a) + " " + a.isPrime(a));
		
		System.out.println(a.equals(7) + " " + a.equals(a));
		
		char[] b = {'1', '2', '3', '4'};
		System.out.println(a.parseInt(b));
		
		String c = "1234";
		System.out.println(a.parseInt(c));
	}

}

