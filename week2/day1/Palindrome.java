package week2.day2.assignments.mandatory;

public class Palindrome {
	
public static void main(String[] args) {
		
		String A = "madam";
		String rev = "";
		
		char[] charAt = A.toCharArray();
		
		System.out.println(charAt);
		
		for (int i = A.length()-1; i >= 0; i--) {
			
			rev=rev+charAt[i];
		}
	
	if(rev.equalsIgnoreCase (A))
		{
			System.out.println(A+" is palindrome");
			
		}
		else
		{
			System.out.println(A+" is not a palindrome");
		}
		
	}

	


}
