package exceptionfiles;

public class NegativePaymentException extends Exception {
	double payment; 
	
	public NegativePaymentException(double payment) {
		this.payment = payment; 
		System.out.println("ERROR: negative payment"); 
	}
	
	public String toString() {
		return "Error: cannot take negative payment " + payment; 
	}
}
