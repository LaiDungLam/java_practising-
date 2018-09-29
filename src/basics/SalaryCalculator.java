package basics;

public class SalaryCalculator {
	public static void main (String[] args) {
	//declare a variable
	String career; 
	System.out.println("Program is starting");
	career = "Software Developer"; 
	System.out.println("My career is: " + career);
	
	//declare and define varible. IT IS DEFINE THAT MATTERS. 
	
	int hoursPerWeek = 40; 
	int weekPerYear = 50; 
	double rate = 42.50; 
	
	double salary = hoursPerWeek*weekPerYear*rate; 
	career = "Web developer";
	
	System.out.println("My salary as a " + career + "at the rate of "
			+ rate + "is $" + salary + "per year");
	System.out.println(salary);	
	}
}
