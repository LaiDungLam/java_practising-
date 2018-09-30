package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		//1. define the path that we want to write 
		String fileName = "D:\\JAVA\\Files\\FileToWrite.txt";
		String message = "I'm writing data that will be placed to the file"; 
		//2. create the file in Java
		File file = new File(fileName); 
		
		//3. open the file
		
		try {
			
			FileWriter fw = new FileWriter(file);
			
			//4. write to the file
			fw.write(message);
			
			//5. close the resources
			fw.close(); 
		} catch (IOException e) {
			System.out.println("ERROR: could not read file: " + fileName);
			e.printStackTrace();
		}finally { 
			System.out.println("Closing the filewriter");
		}
		
		
		
		
		

	}

}
