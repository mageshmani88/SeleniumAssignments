package collectionsprogram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		
		String str = "PayPal India";

		// Convert the string to a character array
		char[] charArray = str.toCharArray();

		// Create a set to hold unique characters
		Set<Character> charSet = new LinkedHashSet<>();

		// Create a set to hold duplicate characters
		Set<Character> dupCharSet = new LinkedHashSet<>();

		// Iterate over the character array and add each character to the charSet
		for (char c : charArray) {
		    if (!charSet.add(c)) { // if the character is already in the set
		        dupCharSet.add(c); // add it to the duplicate set
		    }
		    
		}

		// Remove any characters in the duplicate set from the charSet
		charSet.removeAll(dupCharSet);

		// Iterate over the charSet and print each character that isn't a space
		for (Character c : charSet) {
		    if (c != ' ') {
		    	System.out.print(c);
		    }
		    
		}


	}

}
