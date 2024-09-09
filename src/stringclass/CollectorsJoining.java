package stringclass;
import java.util.*;  
import java.util.stream.Collectors;
public class CollectorsJoining
{
	public static void main(String args[])  
	    {  
	    List<String> liststr = Arrays.asList("abc","pqr","xyz"); //List of String array  
	    String str = liststr.stream().collect(Collectors.joining(":")); //p
	    System.out.println(str.toString());  //Displays result
	    }
	}