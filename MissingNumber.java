package collectionsprogram;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		
		
		int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10 }; // the array of numbers from 1 to 10 with one number missing

	      Set<Integer> set = new HashSet<>();
	      for (int num : arr) {
	         set.add(num); // add each number to the set to remove duplicates
	      }

	      int expected = 1;
	      for (int num : set) {
	         if (num != expected) {
	            System.out.println("The missing number is: " + expected);
	            break;
	         }
	         expected++;
	      }
	   }
		

	}


