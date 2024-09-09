package collection;

import java.util.HashSet;
import java.util.Iterator;
public class HashingSet {
public static void main (String[] args) {
	 HashSet<Integer> n = new HashSet<>();
	 
	 // Inserting
	 n.add(1);
	 n.add(2);
	 n.add(3);
	 n.add(1);
	 n.add(4);
	 n.add(9);
	 n.add(6);
	 
	 System.out.println(n);
	
	 // searching - contains
	 if (!n.contains(9)) {
		 System.out.println("does not contain  that number ");
	 }
	 
	 if (n.contains(2)) {
		 System.out.println("does contains that number");
	 }
	 //delete
	// n.remove(1);
	// System.out.println(n);
	 
	 System.out.println(n.contains(3));
	
	 System.out.println( n.size());
	 
	 // Iterator
	Iterator<Integer> it = n.iterator();
	 while (it.hasNext()){
		 System.out.println(it.next());
	 }
}
}
