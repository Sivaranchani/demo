package collectionExampleProgram;
import java.util.*;
import java.util.stream.Collectors;

public class GroupAndCountFrequency {
public static void main (String[] args) {
	List<String> words = Arrays.asList("apple","banana","orange","apple","banana","orange","orange","watermelon","apple");
	 
	//Group by word and count frequency
	Map<String, Long> wordCount= words.stream().collect(Collectors.groupingBy(word->word, Collectors.counting()));

	//Print the frequency of each word
	wordCount.forEach((word, count)->System.out.println("word:" + word+ ", Count:" +count));
	
 }
}
