//problem 10_3
public class MyInteger {
	int value;
	
	MyInteger(){}

	public int getValue() {
		return value;
	}
	
	boolean isEven() {
		return (value % 2) == 0;
	}
	
	boolean isOdd() {
		return (value % 2) != 0;
	}
	
	boolean isPrime() {
		if((value % 2 == 0 && value != 2) || (value % 3 == 0 && value != 3)
				|| (value % 5 == 0 && value != 5) || (value % 7 == 0 && value != 7))
			return false;
		else
			return true;
	}
	
	static boolean isEven(int spcValue) {
		return (spcValue % 2) == 0;
	}
	
	static boolean isOdd(int spcValue) {
		return (spcValue % 2) != 0;
	}
	
	static boolean isPrime(int spcValue) {
		if((spcValue % 2 == 0 && spcValue != 2) || (spcValue % 3 == 0 && spcValue != 3)
				|| (spcValue % 5 == 0 && spcValue != 5) || (spcValue % 7 == 0 && spcValue != 7))
			return false;
		else
			return true;
	}
	
	static boolean isEven(MyInteger MyInteger) {
		return (MyInteger.value % 2) == 0;
	}
	
	static boolean isOdd(MyInteger MyInteger) {
		return(MyInteger.value % 2) != 0;
	}
	
	static boolean isPrime(MyInteger MyInteger) {
		if((MyInteger.value % 2 == 0 && MyInteger.value  != 2) || (MyInteger.value  % 3 == 0 && MyInteger.value  != 3)
				|| (MyInteger.value  % 5 == 0 && MyInteger.value  != 5) || (MyInteger.value  % 7 == 0 && MyInteger.value != 7))
			return false;
		else
			return true;
	}
	
	boolean equals(int spcValue) {
		return this.value == spcValue;
	}
	
	boolean equals(MyInteger MyInteger) {
		return this.value == MyInteger.value;
	}
	
	static int parseInt(char[] a) {
		String s = "";
		for(int i = 0; i < a.length; i ++) {
			s += a[i];
		}
		return Integer.parseInt(s);
	}
	
	static int parseInt(String a) {
		return Integer.parseInt(a);
	}

}
