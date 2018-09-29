package basics;

public class FactorialCompute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		System.out.print(factorial(n));
	}
	
	static int factorial(int n) {
		int result; 
		if (n == 0) {
			result = 1; 
		}
		else if (n == 1) {
			result = 1; 
		}
		else {
			result = n *factorial(n-1);
		}
		return result;
	}
	
	

}
