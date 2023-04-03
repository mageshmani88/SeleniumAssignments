package week1.day2;

public class PrintDuplicatesInArrayAssignment {
	
	public static void main(String[] args) {
        int[] arr = {14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20};
                
        int len = arr.length;
        int count;
        
        System.out.println("Lenght of array = " + len);
        
        for (int i = 0; i < len - 1; i++) {
            count = 0;
            
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            
            if (count > 0) {
                System.out.println(arr[i] + " is a duplicate element");
            }
        }
    }
}
