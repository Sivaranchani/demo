package collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetNavigableSetExample {
	  public static void main(String[] args) {
	        // Create a TreeSet of integers
	        NavigableSet<Integer> treeSet = new TreeSet<>();
	       
	        // Add elements to the TreeSet
	        treeSet.add(10);
	        treeSet.add(20);
	        treeSet.add(30);
	        treeSet.add(40);
	        treeSet.add(50);
	        System.out.println(treeSet);
	        
	        // Use NavigableSet methods
	        System.out.println("Lower than 30: " + treeSet.lower(30));    // 20
	        System.out.println("Floor of 30: " + treeSet.floor(30));      // 30
	        System.out.println("Ceiling of 30: " + treeSet.ceiling(30));  // 30
	        System.out.println("Higher than 30: " + treeSet.higher(30));  // 40
	    }
	  
	  }
	  
