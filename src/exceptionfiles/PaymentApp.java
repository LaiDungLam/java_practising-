package exceptionfiles;

import java.util.Scanner;

public class PaymentApp {
	//take the payment from users
	public static void main(String[] args) {
		double payment = 0; 
		Scanner in = new Scanner(System.in); 
		boolean positivePayment = true; 
		
		do {
			System.out.print("Enter the payment amount: ");

			try {
				payment = in.nextDouble() ; 
				if (payment < 0) {
					positivePayment = false; 
					throw new NegativePaymentException(payment);
				}else {
					positivePayment = true; 
				}
			}catch (NegativePaymentException e) {
				System.out.println(e.toString());
			}

		}while (!positivePayment); 

		
			
	}
}
