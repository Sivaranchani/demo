package collection;

public class LL1 {
	Node head;
	private int size;
	LL1 ()
	{
		this.size = 0;
	}
	
	class Node{
		String data;
		Node next;
		 Node (String data){
			 this.data= data;
			 this.next=null;
			 size++;
		 }
	}
	//add- first 
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head ==null) {
			head = newNode;
			return;
			
		}
	newNode.next = head;
	head = newNode;
	}
	
	//add last
	public void addLast (String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next!=null) {
			currNode = currNode.next;
			}
		currNode.next = newNode;
		}

	// deleting  first node
	 public void deleteFirst() {
		 //corner case- when a list is empty
		 if (head==null) {
			 System.out.println("the list is empty");
			 return;
			
		 }
		 head = head.next;
	 }
	 // delete last
	 
	 public void deletelast() {
		 if (head==null) {
			 System.out.println(" the list is empty");
		 return;
		 }
		 
		 size--; 
		 
		 if (head.next==null) {
			 head=null;
			 return;
			 
		 }
		 Node secondLast = head;
		 Node lastNode = head.next;
		 while(lastNode.next != null) {
			 lastNode = lastNode.next;
			 secondLast = secondLast.next;
			 
		 }
		 
	 }
	
	
	//print
	public void printList() {
		if (head==null) {
			System.out.println("list is empty");
			return;
			
		}
Node currNode = head;
while(currNode!=null)
	{ 
	
	System.out.print(currNode.data+ "->");
	currNode = currNode.next;
	}
	
	System.out.println("0");
	}

	public int getsize() {
		return size;
		
	}
	
	public static void main (String[] args) {
		LL1 list = new LL1();
		
	list.addFirst("list");
	list.addLast("of");list.addLast("first");
	list.printList();
	list.addLast(" String");
	list.printList();
	System.out.println(list.getsize());
	}
	
	

}
