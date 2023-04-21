package collectionsprogram;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccurances {

	public static void main(String[] args) {


		/*int[] numbers = {2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1};
        Map<Integer, Integer> occurancesMap = new TreeMap<>();

        for (int number : numbers) {
            if (occurancesMap.containsKey(number)) {
                occurancesMap.put(number, occurancesMap.get(number) + 1);
            } else {
                occurancesMap.put(number, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : occurancesMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }*/
		
		int[] arr = {2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1};
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : arr) {
            if (num == -1) {
                continue; // ignore the value -1
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
		
    }

	


