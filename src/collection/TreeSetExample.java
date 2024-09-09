package collection;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	   public static void main(String[] args) {
	        // Create a TreeSet of integers
	        Set<String> treeSet = new TreeSet<>();
	       
	        // Add elements to the TreeSet
	        treeSet.add("loshini");
	        treeSet.add("siva");
	        treeSet.add("charu");
	        treeSet.add("nithya");
	        treeSet.add("kalaivani");
	        treeSet.add("anitha");
	    
	        // Print the TreeSet (sorted order)
	        System.out.println("TreeSet: " + treeSet);
	       
	        // Attempting to add a duplicate element
	        treeSet.add("siva");
	        boolean isAdded =  treeSet.add("siva") ;
	        System.out.println("Was added again? " + isAdded);
	        // This will not be added as 3 is already in the set

	      

	        // Accessing the first and last elements (only possible if you cast to TreeSet or SortedSet)
	        System.out.println("First Element: " + ((TreeSet<String>) treeSet).first());
	        System.out.println("Last Element: " + ((TreeSet<String>) treeSet).last());
	      
	        try {
	            // Attempt to add a null element
	            treeSet.add(null);
	        } catch (NullPointerException e) {
	            System.out.println("Cannot add null element to TreeSet ");
	            System.out.println("Cannot add null element to TreeSet: " + e.getMessage());
	        }
	   
	   }
	}


