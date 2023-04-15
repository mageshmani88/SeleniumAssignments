package week2.day2.assignments.mandatory;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		
		String text1 = "stops";
		String text2 = "potss"; 
		
		String t1="";
		String t2="";
	
	if(text1.length() == text2.length())
	{
		char[] ch1=text1.toCharArray();
		char[] ch2=text2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for(int i=0;i<ch1.length;i++)
		{
			t1=t1+ch1[i];
			t2=t2+ch2[i];

		}

		
		if(t1.equals(t2)) {
			
			System.out.println(text1 + " and " + text2 + " are anagrams!");}
		
		}	
		else {
			System.out.println(text1 + " and " + text2 + " are not anagrams.");}

}

}
