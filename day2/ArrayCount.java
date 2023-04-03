package week1.day2;

import java.sql.Array;
import java.util.Arrays;

public class ArrayCount {
	
	public static void main(String[] args) {
		
		int[] arrCounts = {1,5,7,8,9,0,4,5,2,3,11,21,32,5,23,67};
		System.out.println(arrCounts.length);
		int count = 0;
		
        for (int i = 0; i < arrCounts.length; i++) {
            if (arrCounts[i] == 5) {
                count++;
            }
        }
        System.out.println("Nnumber of times '5' occured in the array is: " + count);
    }
	}


