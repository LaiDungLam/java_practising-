package basics;

public class NumbersCal {
	public static void main(String[] args) {
		System.out.println("the Programming is starting");
		printName(); 
		int numA = 10;  
		int numB = 20; 
		addNumbers(numA, numB); 
		int product = multiply(numA, numB); 
		System.out.println("the product of numA & numB is " + product);
	}

	static void printName() {
		System.out.println("My name is Lam"); 
	}
	
	static void addNumbers(int a, int b) {
		//this function will add two numbers
		int sum = a + b; 
		System.out.println("The sum of two number is " + sum);
	}
	
	static int multiply (int a, int b) {
		int product = a*b; 
		addNumbers(product, product); 
		return product; 
	}
}
