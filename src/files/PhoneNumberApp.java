package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {
	public static void main (String[] args) {
		//this will read a text file and will retrieve phone number
		//valid phone number: 
			//10 digits long
			// Area code cannot start in 0 or 9
			//there can be 911 in the phone
		
		String fileName = "D:\\JAVA\\phone number.txt"; 
		String phoneNum = null; 
		File file = new File(fileName); 
		
		try {
			BufferedReader br = new BufferedReader (new FileReader(file));
			phoneNum = br.readLine(); 
			br.close(); 
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: could not read file");
			e.printStackTrace();
		} 
		
		try {
			if (phoneNum.length() != 10 ){
				throw new tenDigitsException(phoneNum); 
			}
			if (phoneNum.substring(0, 1).equals("0")|| phoneNum.substring(0,  1).equals("9")){
				throw new areaCodeException(phoneNum); 
			}
			
			for(int n = 0; n < phoneNum.length() - 2; n++ ) {
				if (phoneNum.substring(n, n+ 1).equals("9")) {
					if (phoneNum.subSequence(n+1, n+3).equals("11")) {
						throw new EmergencyException(); 
					}
				}
			}
			
			
			
			System.out.println(phoneNum);
		} catch(tenDigitsException e) {
			System.out.println("Error: phone number is not ten digits");
			System.out.println(e.toString());
		}catch (areaCodeException e) {
			System.out.println("Error: phone no has invalid read code");
			System.out.println(e.toString());
		} catch (EmergencyException e) {
			System.out.println("Error: Invalid 911 sequence found");
			
			e.printStackTrace();
		}
		
	}
	
	
}

class tenDigitsException extends Exception {	
	String num; 
	tenDigitsException(String num) {
		this.num = num; 
	}
	public String toString() {
		return ("TendigitExpectipns: " + num);
	}
}

class areaCodeException extends Exception {
	String num; 
	areaCodeException (String num) {
		this.num = num;
	}
	public String toString() {
		return ("areaCodeException: " + num);
	}
}

class EmergencyException extends Exception {
	
}