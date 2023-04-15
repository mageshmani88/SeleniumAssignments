package week2.day2.assignments.mandatory;

public class FindTypes {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each
		
		//Convert the String to character array
		char[] chars = test.toCharArray();
		
		//Traverse through each character (using loop)
		
		for (char c : chars) {
			
			//Find if the given character is what type using (if)
			
		    if (Character.isLetter(c)) {
		        letter++;
		    } else if (Character.isDigit(c)) {
		        num++;
		    } else if (Character.isSpaceChar(c)) {
		        space++;
		    } else {
		        specialChar++;
		    }
		}

		// Print the count here
		System.out.println("Total Letter of '$$ Welcome to 2nd Class of Automation $$' is : " + letter);
		System.out.println("Total space of '$$ Welcome to 2nd Class of Automation $$' is : " + space);
		System.out.println("Total number of '$$ Welcome to 2nd Class of Automation $$' is : " + num);
		System.out.println("Total special character of '$$ Welcome to 2nd Class of Automation $$' is : " + specialChar);


	}


}
