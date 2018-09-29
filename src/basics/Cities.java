package basics;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// there are three different ways to define an array. 
		String[] cities = {"HCM", "Hannoi", "Danang", "Hoian", "Dalat"}; 
//		System.out.println(cities[0]);
//		System.out.println(cities[1]);
//		System.out.println(cities[2]);
//		System.out.println(cities[3]);
//		
		String[] states = new String[5]; 
		states[0] = "California";
		states[1] = "Ohio"; 
		states[2] = "New Jersey"; 
		states[3] = "Texas";
		states[4] = "Utah";
		
		int i = 0 ; 
//		do {
//			System.out.println("STATE at " + i +"is " + states[i]);
//			i++; 
//		} while (i < 5); 
//	
//		while (i < 5 ) {
//			System.out.println(states[i]);
//			i++;
//		}
//		
		boolean stateFound = false;
//		while (!stateFound) { //while true 
//			String  state = states[i]; 
//			if (state == "Utah") {
//				System.out.println("STATE FOUND!"); 
//				System.out.println(state); 
//				System.out.println(i);
//				stateFound = true; //then the condition !true is false, whic
//				//will break the loop. 
//			}
//			i++; 
//		}
	
		for (i = 0; i < 5; i++) {
			System.out.println(states[i]);
			if (states[i] == "New Jersey") {
				System.out.println("stateFound");
				break; 
			}
		}
	
	}
	}



