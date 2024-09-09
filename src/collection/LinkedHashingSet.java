package collection;
// library management system
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashingSet {
	public static void main(String[] args) {
		// 1. Create a LinkedHashSet to store the issued books
		LinkedHashSet<String> issuedBooks = new LinkedHashSet<>();
		
		//2. Add books to the LinkedHashSet
		issuedBooks.add("Life of Pie");
		issuedBooks.add("To Kill a MockingBird");
		issuedBooks.add("Five feet Apart");
		issuedBooks.add("The Wind");

		// Attempting to add a duplicate book
		Boolean isAdded = issuedBooks.add("The Wind");
		System.out.println(isAdded);
		//Display current set of issued books
	 	System.out.println("\nBooks issued (in order of issuance):");
		for( String book : issuedBooks) {
			System.out.println(book);
		}
		
		//check if a book has already been issued
		String bookToCheck = "Life of Pie";
		if (issuedBooks.contains(bookToCheck)) {
			System.out.println("\nThe Book'"+bookToCheck+"' has already been issued");
		}
		
		//Remove a book from the issued list( When Returned)
		
		issuedBooks.remove("Five feet Apart");
		System.out.println("After returning 'Five feet Apart'");
		
		// Iterating using an Iterator
		Iterator<String>iterator = issuedBooks.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
			
		}
		//clear the set after all books are returned
		issuedBooks.clear();
		System.out.println("\nAll books returned. Is the issued books list empty?"+issuedBooks.isEmpty());
		
	}

}
