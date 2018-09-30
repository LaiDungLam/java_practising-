package exceptionfiles;

public class CommonExpections {
	public static void main(String[] args) {
		int a = 5; 
		int b = 0; 
		
		//1. identify the potential problem areas. Critical thinking & investigate
		//2. Surround with Try & Catch Block
		try {
			int c = a/b; 
		}catch (ArithmeticException e){
			System.out.println("Cannot divide by zero");
			System.out.println(e.toString()); 
		}
		
		System.out.println("program is closing");
		
		String[] states = {"CA", "TX", "FL", "NY"}; 
		
		for (int i = 0; i<= states.length; i++) {
			try {
				System.out.println(states[i]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Index outside of array domain");
				System.out.println(e.toString());
			}finally {
				System.out.println("interating thorugh array"); 
			}
			
		}
	}
}
