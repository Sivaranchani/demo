package collectionExampleProgram;

import java.util.*;

class Employee {
	 String name;
	 int age;
	 
	 Employee(String name, int age){
		 this.name = name;
		 this.age = age;
		 
	 }

 @Override 
 public boolean equals(Object o) {
	 if (this == o) return true;
	 if (o==null|| getClass()!=o.getClass())return false;
	 Employee employee = (Employee) o;
	 return age == employee.age&& Objects.equals(name,employee.name);
 }
 
 @Override
public int hashCode() {
	 return Objects.hash(name,age);
	 
}

 @Override
 public String toString() {
	 return name+"("+ age +")";
 }
 
	public static void main (String[]args) {
    List<Employee> list1 = new ArrayList<>(Arrays.asList(
    		new Employee("Anil",30),
    		new Employee("Abi",40),
    		new Employee("Anbu",25)
    		));
		
    List<Employee> list2 = new ArrayList<>(Arrays.asList(
    		new Employee("Akil",33),
    		new Employee("akash",40),
    		new Employee("aditya",25)
    		));
    
    // merging lists
    list1.addAll(list2);
    //Removing duplicates using set
    
    List<Employee> mergedList= new ArrayList<>(new HashSet<>(list1));
    
    //Sorting by age
    mergedList.sort(Comparator.comparingInt(e->e.age));
    
    mergedList.forEach(System.out::println);
	}

 }
 

