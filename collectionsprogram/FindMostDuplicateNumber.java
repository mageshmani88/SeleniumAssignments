package collectionsprogram;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FindMostDuplicateNumber {

	public static void main(String[] args) {


		String input = "abbaba";
        char[] characters = input.toCharArray();
        LinkedHashMap<Character, Integer> occurrenceMap = new LinkedHashMap<>();

        for (char c : characters) {
            if (occurrenceMap.containsKey(c)) {
                occurrenceMap.put(c, occurrenceMap.get(c) + 1);
            } else {
                occurrenceMap.put(c, 1);
            }
        }

        int maxOccurrence = 0;
        char mostDuplicate = ' ';

        for (char c : occurrenceMap.keySet()) {
            int occurrence = occurrenceMap.get(c);
            if (occurrence > maxOccurrence) {
                maxOccurrence = occurrence;
                mostDuplicate = c;
            }
        }

        System.out.println("The most duplicated character in the input string '" + input + "' is: " + mostDuplicate);
    }

	}


