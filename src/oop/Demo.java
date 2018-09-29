package oop;

class Person {
	String name; 
	String email; 
	String phone; 
	
	void walk() {
		System.out.println(name + "is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + "is sleeping");
	}
	
}
public class Demo {
	public static void main(String[] args) {
		//person
		// this is to instantiating an object. 
		Person person1 = new Person(); 
		person1.name = "Joe"; 
		person1.email = "Joe@gmail.com"; 
		person1.phone = "1023435"; 
		
		//abstraction; 
		person1.walk(); 
		person1.sleep(); 
		person1.eat();
		
//		String name = "Joe"; 
//		String email = "joe@gmail.com"; 
//		String phone = "0906961411"; 
//		
//		walking(name); 
//		System.out.println(name + "is eating");
//		
//		String name2 = "Sara"; 
//		String email2 = "sara@gmail.com"; 
//		String phone2 = "0906961412"; 
//		
//		walking(name2); 
//		System.out.println(name + "is eating");
//		
//		
//		//enhance by adding function to minimize code
//		
//		
//		//what about binding attribute and properties together; 
//	}
//	
//	static void walking (String name) {
//		System.out.println(name + "is walking");
//	}
		
		
}
}
