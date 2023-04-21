package collectionsprogram;

import java.util.Arrays;



public class SortingUsingCollectin {
	
	public static void main(String[] args) {
	     
		
		String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

	      // get the length of the array
	      int length = companies.length;

	      // sort the array
	      Arrays.sort(companies);

	      // Iterate it in the reverse order and print the array
	      for (int i = length-1; i >= 0; i--) {
	         System.out.print(companies[i] + ", ");
	      }
	   }
}
