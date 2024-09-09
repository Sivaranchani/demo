package whileloop;
import java.util.Scanner;
public class While {
	/*public static void main(String[] args) {  
	    /* int i=1;  
	    while(i<=10){ 
	    	i++;
	        if(i==7) {
	        	continue;
	        }
	        	System.out.println(i);
	    } 
	    
	   
	     //infinte while:
	     // while(true){  
          //code to be executed  
           //      }
	     
	    
	    
	    
	    while(true){    
        System.out.println("infinitive while loop");    
    }    
	}  */
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the starting number: ");
	        int start = scanner.nextInt();
	        System.out.print("Enter the ending number: ");
	        int end = scanner.nextInt();
	        scanner.close();

	        int size = end - start + 1;
	        int[] numbers = new int[size];

	        for (int i = 0; i < size; i++) {
	            numbers[i] = start + i;
	        }

	        // Print the array
	        System.out.println("Numbers between " + start + " and " + end + ":");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	    }
	}


