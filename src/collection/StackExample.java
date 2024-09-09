package collection;
import java.util.Stack;

public class StackExample {
public static void main(String[] args) {
	// create a stacks of integers
	Stack<Integer> stack = new Stack<>();
	
	//Pushing elements onto the stack 
	System.out.println("Pushing the element onto the stack:");
	stack.push(10);
	stack.push(20);
	stack.push(30);
	stack.push(40);
	stack.push(50);
	
	//Displaying the current stack
	System.out.println("current stack:" + stack);
	//Popping elements from the stack
	System.out.println("Popping elements from the stack:");
	System.out.println("Popped:" + stack.pop());
	System.out.println("Popped:" + stack.pop());
	
	//Displaying the current stack
	System.out.println("Current stack:" + stack);
	
    // Peeking the top element without removing it
	System.out.println("Peeking the top element:");
	System.out.println("Top element: " + stack.peek());
	
	// checking if the stack is empty
	System.out.println("Is the stack empty?"+ stack.isEmpty());
	
	//Searching for an element in the stack
	System.out.println("Position of element 10 in stack:"+ stack.search(10));
	System.out.println("Position of element 40  in stack:"+ stack.search(50));
	
	//Popping remaining elements to empty the stack
	System.out.println("Popping remaining elements:");
	System.out.println("Popped:"+ stack.pop());
	System.out.println("Popped:"+ stack.pop());
	
	//Checking if the stack is empty now
	System.out.println("Is the stack empty?" + stack.isEmpty());
	
	System.out.println("Popped:" + stack.pop());
	System.err.println("Is the stack empty?" + stack.isEmpty());
	
}
}
