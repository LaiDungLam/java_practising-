package labs;

import java.util.Random;

public class StudentDatabase {
	public static void main(String[] args) {
		
		//create a student
		Student stu1 = new Student("12345565768768686", "John Maccain"); 
		stu1.enronll("Math");
		stu1.enronll("Literature"); 
		stu1.enronll("Music"); 
		stu1.showCourse();
		stu1.pay(2000);
		stu1.checkBalance();
		System.out.println(stu1.toString()); 
//		stu1.setCity("New York");
//		System.out.println(stu1.getCity());
		
//		Student stu2 = new Student("5947562452645", "Lam Lai"); 
//		Student stu = new Student("0345495645657", "Ly Nguyen"); 
//		Student stu3 = new Student("03483245245687", "Chau Lai"); 
		
	}
}
	
class Student {
	//Properties
		String SSN; 
		String name; 
		private static int iD = 1000; 
		String course = ""; 
		int balance; 
		private String phone; 
		private String city; 
		private String state; 
		private String email; 
		String userID; 
		private static final int costOfCourse = 800; 
		private int totalTuition = 0; 
		
		public Student(String ssn, String name) { //constructor should be let it public 
			this.SSN = ssn; 
			this.name = name; 
			iD++; 
			System.out.println("Name of the Student is: " + this.name);
			System.out.println("SSN of the Student is: " + SSN);
			setEmail(); 
			setUserID(); 
			
		}
		
		private void setUserID() {
			int randNum = (int)(Math.random()*((9000-1000) + 1) + 1000);
			userID = iD + "" + randNum + SSN.substring(SSN.length() - 4);
			System.out.println("the student ID is: " + userID); 
			
		}
		//2. create email
		private void setEmail() {
			email = name.replaceAll(" ", ".").toLowerCase() + "." + iD + "@gmail.com"; 
			System.out.println("The email of the Student is: " + email);
		}
		
		//now the method 
		String enronll(String courseRegister) {
			this.course = this.course + courseRegister + ", "; 
			System.out.println("you have just registered: " + courseRegister);
			totalTuition = totalTuition + costOfCourse; 
			System.out.println("You tuition is: " + totalTuition); 
			return course;
		}
		
		void pay(int tuitionFee) {
			balance = totalTuition - tuitionFee; 
			System.out.println("you have just paid: " + tuitionFee);
			totalTuition = totalTuition - tuitionFee; 
			System.out.println("You need to pay:  more " + totalTuition);
		}
		
		void checkBalance() {
			System.out.println("the balance is:  " + totalTuition); 
		}
		

		public String toString() {
			return "[NAME: " + name + " ]\n[COURSES: " + course + "]\n[BALANCE: " + balance + " ]";
			
		}
		
		void showCourse() {
			System.out.println("course Enroll: " + course);
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
		
		
		
	}
	
