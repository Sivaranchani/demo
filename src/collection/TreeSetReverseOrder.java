package collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// Custom Sorting with a Comparator

public class TreeSetReverseOrder {
public static void main(String[] args) {
	Set<String> treeSet = new TreeSet<>(new Comparator<String>()
	{
		@Override
		public int compare(String s1, String s2) {
			return s2.compareTo(s1);
		}
	});
	
	// Add elements to the TreeSet
	 treeSet.add("apple");
     treeSet.add("banana");
     treeSet.add("grape");
     treeSet.add("kiwi");
     treeSet.add("mango");
     
     // Print the TreeSet
     System.out.println("TreeSet with reverse alphabetical order: " + treeSet);
		}
	}
	
