package collection;
import java.util.*;
public class LinkedList2 {
public static void main (String args[]) {
	LinkedList<String> list = new LinkedList<String>();
	list.addFirst("a");
	list.addFirst("is");
	list.addLast("list");
	System.out.println(list);
	
	list.addFirst("This");
	list.addLast("of");
	list.add("string");// add in last by default
	System.out.println(list);
	
System.out.println(list.size());

for (int i = 0;i<list.size(); i++) {
	if( list.get(i)== "of") { // searching of the elements.
	System.out.print(list.get(i)+'-');
	}
}
System.out.print("null");

list.removeFirst();
System.out.println(list);

list.removeLast();
System.out.println(list);

list.remove(2);
System.out.println(list);


System.out.println(list);       

}

}
