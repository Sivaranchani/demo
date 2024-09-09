package stringclass;

	import java.util.HashSet;
	import java.util.Set;
public class ExampleforUniqueCharacterd {
	
	    public static void main(String[] args) {
	        String word = "example"; // Replace with your word
	        int uniqueCount = countUniqueCharacters(word);
	        System.out.println("Number of unique characters: " + uniqueCount);
	    }

	    public static int countUniqueCharacters(String word) {
	        Set<Character> uniqueChars = new HashSet<>();
	        for (char c : word.toCharArray()) {
	            uniqueChars.add(c);
	        }
	        return uniqueChars.size();
	    }
	}

