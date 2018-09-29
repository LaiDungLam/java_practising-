package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("123445677", 1000);
		acc1.payBill(3000);
		acc1.makeDeposit(1000000);
		acc1.showBalance(); 
		acc1.accrue();
		
		
		BankAccount acc2 = new BankAccount("313445545", 2000); 
		BankAccount acc3 = new BankAccount("645469900", 3000);
		
		acc1.setName("Jim");
		acc1.getName(); 
	}

}


class BankAccount implements IInterest {
	//properties of bank account
	private static int iD = 1001; //Internal ID
	private String accountNumber; //iD + random 2 -digit numbers plus the first 2 of SSN
	private static final String routingNumber = "034549669"; 
	private String name; 
	private String ssn; 
	private double balance; 
	
	//Constructors
	public BankAccount(String ssn) {
		System.out.println("New Account Created"); 
		this.ssn = ssn; 
		System.out.println("the ID of this customer is: " + iD);
		iD++; 
		setAccountNumber(); 
	}
	
	public BankAccount (String ssn, int balance) {
		System.out.println("New Account Created"); 
		this.ssn = ssn; 
		System.out.println("the ID of this customer is: " + iD);
		iD++; 
		setAccountNumber(); 
	}
	private void setAccountNumber() {
		int random = (int)Math.random()*100; 
		System.out.println(random);
		accountNumber = iD + "" + random + "" + ssn.substring(0,2); 
		System.out.println("Your Account Number: " + accountNumber);
		
	}
	
	public void setName(String name) {
		this.name = name; 
		System.out.println(name);
	}
	
	public String getName(){
		return name; 
	}
	
	public void payBill (double amount) {
		System.out.println("Paybill an amount:" + amount);
		balance = balance - amount; 
	}
	
	public void makeDeposit (double amount) {
		balance = balance + amount; 
	}
	public void showBalance() {
		System.out.println("Balance is: " + balance);
	}
	

	@Override
	public void accrue() {
		 balance = balance*(1+ rate/100); 
		 showBalance(); 
	}
	
	
	public String toString () {
		return "[" + "Name" + name + "]";
	}
}