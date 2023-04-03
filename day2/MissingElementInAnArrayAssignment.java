package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArrayAssignment {
	
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 6, 8};
        
        System.out.println("Missing number in the array list is:");
        
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr[i]) {
                System.out.println(i + 1);
                break;
            }
        }
    }

}
