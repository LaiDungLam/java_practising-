package basics;

public class Weather {
	public static void main(String[] args) {
		String door = "close"; 
		boolean breakIn = true;
		
		if (door != "close" && breakIn) {
			System.out.print ("No arlarm"); 
		}
		else if (door == "close" && breakIn == false) {
			System.out.print("Hey, there is a thief"); 
		}
		else {
			System.out.println("we safte");
		}
	}
}
