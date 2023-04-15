package week2.day2.assignments.mandatory;

public class CharOccurance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "welcome to chennai";
		char target = 'e';
		int count = 0;
		
		// convert the string into char array
		char[] charArray = str.toCharArray();
		// get the length of the array
		int length = charArray.length; 
		// traverse from 0 till the array length
		for (int i = 0; i < length; i++) {
			// Check the char array has the particular char in it
		    if (charArray[i] == target) {
		    	
		    	// if it has increment the count
		        count++; 
		        
		    }
		}
		
		// print the count out of the loop

		System.out.println("The character '" + target + "' occurs " + count + " times in the 'Welcome to Chennai.'");


	}


}
