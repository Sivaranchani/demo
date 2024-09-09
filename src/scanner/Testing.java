package scanner;
import java.util.*;
public class Testing {
	public static int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public static int sub(int a, int b) {
		int c= a-b;
		return c;
	}
	public static int multiple(int a, int b) {
		int c= a*b;
		return c;
	}
	public static int division(int a, int b) {
		int c= a/b;
		return c;
	}
	public static int modulus(int a, int b) {
		int c= a%b;
		return c;
		}
	public static void main(String args[]){   
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two number:");
		 try {
			 int x= in.nextInt();
		 	int y1 =in.nextInt();
		System.out.println("Addition="+add(x,y1));
		System.out.println("Subtraction="+sub(x,y1));
		System.out.println("Multiplication="+multiple(x,y1));
		System.out.println("Division="+division(x,y1));
		System.out.println("Modulus="+modulus(x,y1));
		}
		 catch ( Exception e) {
			System.out.println("you have entered a character");
			 in.close();
		 }
		 }
}







