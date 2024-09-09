package collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetSortedSetExample {
public static void main (String[] args) {
	//create a TreeSet of strings
	TreeSet<String> treeSet = new TreeSet<>();
	 treeSet.add("apple");
     treeSet.add("banana");
     treeSet.add("grape");
     treeSet.add("kiwi");
     treeSet.add("mango");
     treeSet.add("orange");
     
     System.out.println(treeSet);
     // Get a subset (elements from "banana" to "mango")
     SortedSet<String> subSet = treeSet.subSet("banana", "mango" + "\0");
     System.out.println("Subset (banana to mango): " + subSet);

     // Get a headSet (elements less than "grape")
     SortedSet<String> headSet = treeSet.headSet("grape");
     System.out.println("HeadSet (less than grape): " + headSet);

     // Get a tailSet (elements greater than or equal to "kiwi")
     SortedSet<String> tailSet = treeSet.tailSet("kiwi");
     System.out.println("TailSet (kiwi and onwards): " + tailSet);
}
}
