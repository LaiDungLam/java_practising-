package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\PC\\Desktop\\FileToRead2.txt"; 
		File file = new  File(fileName); 
		String text = null; 
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			text = br.readLine(); 
			br.close(); 
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: cannot file the file");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: cannot read the file");
			e.printStackTrace();
		} finally {
			System.out.println("Finished reading the file");
		}
		
		System.out.println(text);
		
		
	}

}
