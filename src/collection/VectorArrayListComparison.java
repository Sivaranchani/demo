package collection;

	//import java.util.ArrayList;

/*	public class VectorArrayListComparison {
	    public static void main(String[] args) {
	        // Create an ArrayList and add elements
	        ArrayList<String> arrayList = new ArrayList<>();
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Cherry");

	        // Access elements
	        System.out.println("ArrayList Element at index 1: " + arrayList.get(1));

	        // Remove elements
	        arrayList.remove("Banana");
	        System.out.println("ArrayList after removal: " + arrayList);

	        // Iterate over ArrayList
	        System.out.println("Iterating over ArrayList:");
	        for (String fruit : arrayList) {
	            System.out.println(fruit);
	        }
	    }
	}*/
	
	
	import java.util.Vector;

	public class VectorArrayListComparison {
	    public static void main(String[] args) {
	        // Create a Vector and add elements
	        Vector<String> vector = new Vector<>();
	        vector.add("Apple");
	        vector.add("Banana");
	        vector.add("Cherry");

	        // Access elements
	        System.out.println("Vector Element at index 1: " + vector.get(1));

	        // Remove elements
	        vector.remove("Banana");
	        System.out.println("Vector after removal: " + vector);

	        // Iterate over Vector
	        System.out.println("Iterating over Vector:");
	        for (String fruit : vector) {
	            System.out.println(fruit);
	        }
	    }
	}



