package array;
import java.util.Scanner;

public class Assignment4 {
	
 public static void printAllNumber(int a, int b) {
	 System.out.println("Printing all numbers starting from "+a+" to "+b);
	 for (int i= a;i<=b;i++)
		 System.out.println(i);
 }
 
 public static void evenodd(int a, int b) {
	 for (int i =a;i<=b;i++) {
		 if (i%2==0)  {
			 System.out.println(i+" is even number");
		 }
		 else {
			 System.out.println(i+" is odd number");
		 }
	 }
 }

public static void array(int a, int b) {
	int len = b-a+2;
	int[] numbers = new int[len];
	System.out.println("Even number are");
	
	for (int i =a;i<=b;i++) {
		numbers[i]= a+i;
	}
	 for (int t:numbers) {
		 if (t%2==0) { System.out.print(t+" ");
		 
		 }
	 }
	 System.out.println();
	 System.out.println("odd number are");
	 for (int t:numbers) {
		 if(t %2!=0) {
			 System.out.print(t+" ");
			 
		 }
	 }
	
 }


		 
 public static void main (String[] args) {
	
	 System.out.println("enter the starting number:");
	 Scanner num1= new Scanner(System.in);
	 int a = num1.nextInt();
	 System.out.println("enter the ending number:");
	 Scanner num2= new Scanner(System.in);
	 int b = num1.nextInt();
	 num1.close();
	 num2.close();
	 printAllNumber(a, b);
	 System.out.println("-------------------------------");
	 evenodd(a,b);
	 System.out.println("-------------------------------");
	array( a,b);
	 
 }
}
