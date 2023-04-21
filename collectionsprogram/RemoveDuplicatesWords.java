package collectionsprogram;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {

		
		String text = "We learn java basics as part of java sessions in java week1";
		// Split the string into words
        String[] words = text.split(" ");
        
     //Create a set to store unique words
        Set<String> uniqueWords = new LinkedHashSet<>(); 
        
     //Add each word to the set
        for (String word : words) {
            uniqueWords.add(word); 
        }
        
     //Print the unique words separated by spaces
        System.out.println(String.join(" ", uniqueWords));
			
		}
        
        
    }

