package scanner;

public class ArithmeticOperatorUtil {

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
	public static void main (String[] args) {
		int  x= 4;
		int y=5;
		System.out.println(add(x,y));
		System.out.println(sub(x,y));
		System.out.println(multiple(x,y));
		System.out.println(division(x,y));
		System.out.println(modulus(x,y));
	}
}
