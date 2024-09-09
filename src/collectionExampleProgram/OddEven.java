package collectionExampleProgram;
import java.util.*;
import java.util.stream.Collectors;
public class OddEven {
	public static void main (String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//partition into even and odd number
		Map<Boolean, List<Integer>> partitioned = numbers.stream()
				.collect(Collectors.partitioningBy(num-> num% 2==0));
				
	//Print even numbers
		System.out.println("Even numbers:" + partitioned.get(true));
		
		//Print odd numbers
		System.out.println("Odd numbers:" + partitioned.get(false));
	}
				
	}
