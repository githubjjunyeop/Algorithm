package Al_01_recursive;

public class recursive_01_factorial {
	
	static int factorial(int n) {
		System.out.println(n);
		if(n == 0) return 1;
		else {
			return n * factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(factorial(3));
	}

}
