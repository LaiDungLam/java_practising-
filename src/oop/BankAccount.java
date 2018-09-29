package oop;

public class BankAccount {

	String accountNumber; 
	String routingNumber; 
	String name; 
	String ssn; 
	String accountType; 
	
	// Constructor defintion; unique methods
	//1. they are used to defined/set up/initizlize properties of an object
	//2. constructors are implicitly called upon instantiation. 	
	//3. the same name as the class itself. 
	//4. has no return type at all. 
	
	BankAccount() { //this is a constructor
		System.out.println("A new account create"); 
	}
	
	//overloading: call same method name with different arguments. 
	
	BankAccount(String accountType) {
		System.out.println("New ACCOUNT" + accountType); 
	}
	
	BankAccount (String accountType, double initDeposit) {
		
	}
	//define methods
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void getStatus() {
		
	}
}
