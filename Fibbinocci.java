package week1.day1;

public class Fibbinocci {
	
	public static void main(String[] args) {
		
		int firstNum = 0, secNum = 1, sum=0;
	       System.out.print(firstNum + " " + secNum);

	       for (int i = 2; i < 11; i++) {
	           sum = firstNum + secNum;
	           System.out.print(" " + sum);
	           firstNum = secNum;
	           secNum = sum;
		
	    }
		
	}

}
