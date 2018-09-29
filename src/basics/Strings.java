package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle; 
		String wordChoice = "Lords"; 
		bookTitle = "Lords or the ring"; 
		if (bookTitle.contains(wordChoice)){
			System.out.println("THe book title contains: " + wordChoice); 
		}
		String browser = "Chrome"; 
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is: " + browser);
		}
		
		String firstName = "Tim"; 
		String lastName = "Short"; 
		String SSN = "123456";
		//print the initials plust las 4 digits of SSN 
		
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 1));
		System.out.println(SSN.substring(5));
		
		
		System.out.println("there are " + SSN.length() + " digits in your SSN"); 
	}

}

