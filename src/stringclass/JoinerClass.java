package stringclass;

import java.util.StringJoiner;

public class JoinerClass {
	public static void main(String[] args)  
	{
	StringJoiner s = new StringJoiner(" ");   //StringeJoiner object  
    s.add("Hello");    //String 1   
    s.add("World");
    s.add("Sivaranchani");
    //String 2  
    System.out.println(s.toString());  //Displays result  
}
}
