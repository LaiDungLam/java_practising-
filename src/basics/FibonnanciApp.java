package basics;

public class FibonnanciApp {
	public static void main (String[] args) {
		// fibonnaci number is defined by the sume of the 2 previous fibonnaci number
		System.out.println(fib(23)); 
		
	}//end of main
	
	public static int fib(int n) {
		if (n == 0) {
			return 0; 
		}
		else if (n == 1) {
			return 1; 
		}
		return ((fib(n-1)) + (fib(n-2)));
	}
}//end of class
