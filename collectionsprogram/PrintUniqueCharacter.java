package collectionsprogram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintUniqueCharacter {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "MageshMani";
        char[] chars = input.toCharArray();
        Set<Character> uniqueChars = new LinkedHashSet<>();
        for (char c : chars) {
            if (uniqueChars.contains(c)) {
                uniqueChars.remove(c);
            } else {
                uniqueChars.add(c);
            }
        }
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
    }

}
