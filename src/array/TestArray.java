package array;

public class TestArray {
	/*public static void main(String[] args) {
	    int[] arr = {33, 6, 4, 5};
	    int[] num = {33, 3,4, 5};

	    boolean areEqual = true;

	    if (arr.length != num.length) {
	        areEqual = false;
	    } else {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != num[i]) {
	                areEqual = false;
	                break;
	            }
	        }
	    }

	    System.out.println("Are the arrays equal? " + areEqual);*/
	
	/*static void min(int arr[]){  
	int min=arr[1];  
	for(int i=1;i<arr.length;i++)  
	 if(min<arr[i])  
	min =arr[i];
 
	  
	System.out.println(min);  
	}  
	  
	public static void main(String args[]){  
	int a[]={33,3,4,5};//declaring and initializing an array  
	min(a);//passing array to method  
	}}  */
	
	/*static void printArray(int arr[]){  
		for(int i=0;i<arr.length;i++)  
		System.out.println(arr[i]);  
		}  
		  
		public static void main(String args[]){  
		printArray(new int[]{10,22,44,66});//passing anonymous array to method  
		}}  */


	/*static int[] get(){  
		return new int[]{10,30,50,90,60};  
		}  
		  
		public static void main(String args[]){  
		//calling method which returns an array  
		int arr[]=get();  
		//printing the values of an array  
		for(int i=0;i<arr.length;i++)  
		System.out.println(arr[i]);  
		}}*/
	
/*	public static void main(String args[]){  
		//declaring and initializing 2D array  
		int arr[][]={{1,2,3,6},{2,4,5,7},{4,4,5,8},};  
		//printing 2D array  
		for(int i=0;i<3;i++){  
		 for(int j=0;j<4;j++){  
		   System.out.print(arr[i][j]+" "); 
		  
		 }  
		 System.out.println();  
		}  
		}}  */
	 
		/*public static void main(String args[]){  
		//declaration and initialization of array  
		int arr[]={4,4,5};  
		//getting the class name of Java array  
		@SuppressWarnings("rawtypes")
		Class c =arr.getClass();  
		String name=c.getName();  
		//printing the class name of Java array   
		System.out.println(name);  
		  
		}}    */
	
	/* public static void main(String[] args) {  
	        //declaring a source array  
	        char[] original = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
	                'i', 'n', 'a', 't', 'e', 'd' };  
	        //declaring a destination array  
	        char[] newword = new char[7];  
	        //copying array using System.arraycopy() method  
	        System.arraycopy(original, 0, newword, 0, 5);  
	        //printing the destination array  
	        System.out.println(String.valueOf(newword));  
	    }  
	}  */

	/*public static void main(String args[]){  
		int arr[]={33,3,4,5};  
		System.out.println("Printing original array:");  
		  
		for(int i:arr)
		System.out.println(i);
		System.out.println("Printing clone of the array:");  
		int carr[]=arr.clone();  
         for(int i:carr) 
		System.out.println(i);  
		  
		System.out.println("Are both equal?");  
		System.out.println(arr!=carr);  
		  
		}}  */

	
		public static void main(String args[]){  
		//creating two matrices  
		int a[][]={{1,3,4},{3,4,5}};  
		int b[][]={{1,3,4},{3,4,5}};  
		  
		//creating another matrix to store the sum of two matrices  
		int c[][]=new int[2][3];  
		  
		//adding and printing addition of 2 matrices  
		for(int i=0;i<2;i++){  
		for(int j=0;j<3;j++){  
		c[i][j]=a[i][j]*b[i][j];  
		System.out.print(c[i][j]+" ");
			
		}  
		System.out.println();//new line
		} }
		} 
		  







