package basics;
import java.util.Arrays; 
import java.util.Collections;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10; 
		System.out.println("The total from 1 to " + n + " is: " + sumNumber(n));
		System.out.println("The factorial of " + n + " is " + factorial(n));
		
		System.out.println("---------------------------------");
		System.out.println("Now the time of Array computatison");
		int[] numArray = {3, 5, 10, 20, 1, 0, 50, 1000};  
		System.out.println("The min value of the array is: " + minArray(numArray)); 
		System.out.println("The max value of the array is: " + maxArray(numArray));
		System.out.println("The average value of the array is: " + avgArray(numArray));
	}
	
	static int sumNumber(int n) {
		int sum = 0; 
		while (n>=1) {
			sum = sum + n; 
			n--; 
		}
		return sum; 
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
	
	static int minArray (int a[]) {
		int min; 
		min = a[0]; 
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i]; 
			}
		}
		return min; 
	}
	
	static int maxArray (int a[]) {
		int max; 
		max = a[0]; 
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i]; 
			}
		}
		return max; 
	}
	
	static int avgArray (int a[]) {
		int sumOfArray = 0; 
		for (int i = 0; i < a.length; i++) {
			sumOfArray = sumOfArray + a[i]; 
		}
		int average = sumOfArray/a.length; 
		return average; 
	}

}
