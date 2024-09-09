package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//add elements
		list.add(4);
		list.add(6);
		list.add(5);
		list.add(3);
		System.out.println("adding elements");
		System.out.println(list);
		
		// get elements
		
		System.out.println("getting the element using index value");
		System.out.println(list.get(2));
		
		
	    //add element inbetween
		System.out.println("adding element ");
		list.add(0, 10);
		System.out.println(list);
		
			
		//deleting
		System.out.println("deleting the element");
		list.remove(3);
		System.out.println(list);
		
		//size
		System.out.println("getting the list length");
		System.out.println(list.size());
		
		
		//looping
		System.out.println("using for loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
					}
		
		//sorting in ascending order
		System.out.println("Sorting the list in ascending"); 
		Collections.sort(list);
		System.out.println(list);
		
		// sorting in descending order
		System.out.println("sorting the list in descending order");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        
		//Iterator
		System.out.println("Using Iterator");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			}
			
	   // Iterating using for each loop
		System.out.println("Using for each loop ");
			for(Integer num:list) {
				System.out.println(num);
			}
				
	 //replacing the element
				System.out.println("replacing element using set");
				list.set(0, 189);
				System.out.println(list);
				
	 // list Iterator
				System.out.println("list Iterator");
				ListIterator<Integer> listIterator= list.listIterator();
				System.out.println("forward direction Iteration:");
				while (listIterator.hasNext()) {
					System.out.println(listIterator.next());
					
				}
				
		System.out.println("for backward direction iterator");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		}
	

}
