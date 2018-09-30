package exceptionfiles;

public class NegativePaymentException extends Exception {
	//define class variable 
	double payment; 
	//1. constructor that takes the value that would throw the exception
	//2. assign value of local variable to class variable 
	public NegativePaymentException(double payment) {
		this.payment = payment; 
		System.out.println("ERROR: negative payment"); 
	}
	
	//3. Override the toString() method to include the specific exception message
	public String toString() {
		return "Error: cannot take negative payment " + payment; 
	}
}
