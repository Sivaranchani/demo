package collectionExampleProgram;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment5 {
public static void main (String[] args) {
	int firstNo;
	int lastNo;
	ArrayList<Integer> list = new ArrayList<>();
	ArrayList<Integer> evenList = new ArrayList<>();
	ArrayList<Integer> oddList = new ArrayList<>();
	Scanner in = new Scanner(System.in);
	System.out.println("enter first No");
	 firstNo  = in.nextInt();
	 System.out.println("enter last No");
		lastNo = in.nextInt();
		in.close();
		
	for (int i=firstNo;i<=lastNo;i++) {
		list.add(i);
		
		if ( i% 2==0) {
			evenList.add(i);
}
		else {
			oddList.add(i);
		}
	
		
	}
	System.out.println(" Printing all number in main list - "+list);
	System.out.println(" Printing all number in even list - "+evenList);
	System.out.println(" Printing all number in odd list - "+oddList);
}

  }

