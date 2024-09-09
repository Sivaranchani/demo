package stringclass;
import java.util.Scanner;
public class Assignment3 {
	 public static void split(String word) {
			 int half= word.length()/2;
			String firsthalf= word.substring(0, half);
			String secondhalf= word.substring( +half);
				System.out.println(" First Half:"+ firsthalf);
			System.out.println(" Second Half:"+ secondhalf);
			
 }
	 public static void occurence(String word) {
			int len = word.length();
			int count[]= new int [256];
			for (int i = 0; i < len; i++)  
				 count[word.charAt(i)]++; 
				 char ch[] = new char[word.length()];
				 
			for (int i = 0; i < len; i++)  { 
				  ch[i] = word.charAt(i);
		            int find = 0;
		            for (int j = 0; j <= i; j++) {
		                if (word.charAt(i) == ch[j])
		                    find++;
		            }
		            if (find == 1)
		                System.out.println("Number of Occurrence of " + word.charAt(i) + " is: " + count[word.charAt(i)]);
			}
			}


		public static void uniquecharacter(String word) {
			int[]charCount=new int[256];
		
			int len= word.length();
			for(int i=0;i<len;i++) {
		    char currentChar = word.charAt(i);
		    charCount[currentChar]++;
			}
	StringBuilder uniqueCharacters = new StringBuilder();
	int uniqueCount=0;
	for(int i=0;i<len;i++) {
		char currentChar = word.charAt(i);
		if(charCount[currentChar]==1) {
			if (uniqueCharacters.indexOf(String.valueOf(currentChar))==-1) {
				uniqueCharacters.append(currentChar).append(" ");
				uniqueCount++;
				
			}
			}
	}
			
	System.out.println("Unique characters: " + uniqueCharacters.toString().trim());
	System.out.println("Number of unique characters: " + uniqueCount);
			
		}


		public static void reverseword(String word) {
			  StringBuilder reversedWord = new StringBuilder();
			    for (int i = word.length() - 1; i >= 0; i--) {
			        reversedWord.append(word.charAt(i));
			    }
			   System.out.println( " Reversed word - "+reversedWord.toString());
			}

	
	public static void main (String[] args) {
		System.out.println("Enter a big word");
       Scanner scanner= new Scanner(System.in);
     
        String word = scanner.nextLine();
        scanner.close();
	      occurence(word);
	      System.out.println("-------------------------------------");
	      split(word);
	      System.out.println("-------------------------------------");
	      reverseword(word);
	      System.out.println("-------------------------------------");
	      uniquecharacter(word);
	}
	
	
	}
		
	
   
		




	
		
