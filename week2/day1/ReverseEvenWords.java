package week2.day2.assignments.mandatory;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester";
		
		//split the words and have it in an array
		
	    String[] wordsplit = test.split(" ");
	    String result = "";
	    
	    //Traverse through each word (using loop)
	    
	    for (int i = 0; i < wordsplit.length; i++) {
	    
	    	if((i+1)%2==0) {
	        
	    		char[] Chars = wordsplit[i].toCharArray();
	        
	    		for (int j = Chars.length - 1; j >= 0; j--) {
	          
	    			result += Chars[j];
	        }
	        
	    		result += " ";
	      } else {
	        
	    	  result += wordsplit[i] + " ";
	      }
	    }
	    
	    System.out.println("Output of Reverse Even Words : " + result.trim());
	  }

	
}
